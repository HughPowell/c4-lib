(ns leiningen.new.c4-lib
    (:require [leiningen.new.templates :refer [renderer name-to-path ->files year
                                               project-name sanitize-ns]]
      [leiningen.core.main :as main]))

(def render (renderer "c4-lib"))

(defn c4-lib
      "Creates a project that is C4, MPLv2 and has Travis and Clojars Continuous Deployment"
      [proj-name github-username full-name]
      (let [data {:name              (project-name proj-name)
                  :project-path      (name-to-path proj-name)
                  :github-username   github-username
                  :full-name         full-name
                  :year              (year)
                  :namespace         (str (sanitize-ns proj-name) ".v1.public")
                  :full-project-name proj-name}]
           (main/info "Generating fresh 'lein new c4-lib' project with C4, MPLv2 and has Travis and Clojars Continuous Deployment.")
           (->files data
                    [".gitignore" (render ".gitignore" data)]
                    [".travis.yml" (render ".travis.yml" data)]
                    ["AUTHORS" (render "AUTHORS" data)]
                    ["LICENSE" (render "LICENSE" data)]
                    ["project.clj" (render "project.clj" data)]
                    ["README.md" (render "README.md" data)]
                    ["deploy/travis_to_clojars.sh" (render "travis_to_clojars.sh" data)]
                    ["src/{{project-path}}/v1/public.clj" (render "public.clj" data)]
                    ["test/{{project-path}}/v1/public_test.clj" (render "public_test.clj" data)])))
