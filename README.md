# c4-lib

[![Build Status](https://travis-ci.org/HughPowell/c4-lib-template.svg?branch=master)](https://travis-ci.org/HughPowell/c4-lib-template)
[![Clojars Project](https://img.shields.io/clojars/v/c4-lib/lein-template.svg)](https://clojars.org/c4-lib/lein-template)

Template that is C4, MPLv2 and has Travis to Clojars Continuous Deployment

## Usage

Use the following leiningen command to create a new library called [new-library-name]

    lein new c4-lib [new-library-name] [github-username] [your-name]

where
 * [github-username] is your GitHub user name (or that of the organisation that will own this library)
 * [your-name] is your name (e.g. "Joe Bloggs")

 e.g.

    lein new c4-lib my-new-lib JoeBloggs "Joe Bloggs"

### Continuous Deployment

Continuous Deployment requires secure environment variables so this is initially disabled in the .travis.yml file.  To enable Continuous Deployment add the required secure variables ([Clojars](https://clojars.org/) username and password, [GitHub secure token](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) and the releasers email address) securely and uncomment the deploy section.

### Steps to get up and running (automate this)

* Create new library using this template
* Create empty repository on GitHub with the same name as your new library
* Push the newly created library to GitHub
* Go to [travis-ci.org](https://travis-ci.org), sync with your GitHub account and select your new library for building
* Make the deployment script executable (e.g. chmod +x deploy/travis-to-clojars.sh)
* Generate required secure tokens for .travis.yml using `travis encrypt ...`
* Uncomment deployment section in .travis.yml
* Commit and push
* Verify results in Travis and Clojars

## Hacking on this Template

To download and install the template locally

    git clone git@github.com:HughPowell/c4-lib.git
    cd c4-lib
    lein install
    cd ..

## Ownership and License

Copyright © 2017 Hugh Powell

The contributors are listed in AUTHORS. This project uses the [MPL v2 license](https://www.mozilla.org/en-US/MPL/2.0/), see LICENSE.

c4-lib uses the [C4 (Collective Code Construction Contract)](https://rfc.zeromq.org/spec:42/C4) process for contributions.

c4-lib uses the [clojure-style-guide](https://github.com/bbatsov/clojure-style-guide) for code style.

To report an issue, use the c4-lib [issue tracker at github.com](https://github.com/HughPowell/c4-lib/issues).
