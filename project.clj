(defproject c4-lib/lein-template "0.1.0"
  :description "Template that is C4, MPLv2 and has Travis to Clojars Continuous Deployment"
  :url "https://github.com/HughPowell/c4-lib"
  :license {:name "Mozilla Public License v2.0"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :repositories [["releases" {:url "https://clojars.org/repo/"
                              :username :env
                              :password :env
                              :sign-releases false}]]
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "--no-sign"]
                  ["deploy"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]]
  :eval-in-leiningen true)
