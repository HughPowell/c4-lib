# c4-lib

Template that is C4, MPLv2 and has Travis and Clojars Continuous Deployment

## Usage

Use the following leiningen command to create a new library called library-name

    lein new c4-lib library-name

### Continuous Deployment

Continuous Deployment requires secure environment variables so deployment is initially disabled in the .travis.yml file.  To enable Continuous Deployment add the required secure variables ([Clojars](https://clojars.org/) username and password, [GitHub secure token](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) and the releasers email address) securely and uncomment the deploy section.

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
