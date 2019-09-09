## [4.1.1]

- (SERVER-2193) Update jruby-utils to 2.2.0, which adds an API for getting
  thread dumps of JRuby instances
- Update tk-scheduler to work with Java 11

## [4.1.0]

- Add jruby-utils to managed dependencies

## [4.0.5]

- Update tk-scheduler to create unique schedulers per service start
- Update tk-jetty9 to suppress empty contextPath warnings

## [4.0.4]

- Update ssl-utils to allow loading private keys in pkcs8 format (see SERVER-2019).

## [4.0.3]

- Update tk-filesystem-watcher to take advantage of new clj-commons/fs.

## [4.0.2]

- Update trapperkeeper to take advantage of new kitchensink, clj-commons/fs,
  and clj-commons/clj-yaml.
- Update clj-http-client to take advantage of FIPS enabled ssl-utils.

## [4.0.1]

- Update kitchensink to take advantage of clj-commons/fs

## [4.0.0]

Potentially breaking changes for consumers listed below:

- jvm-ssl-utils now supports FIPS bouncy castle, as a consequence it will
  no longer bring in bouncycastle to consumers, they will have to specify
  the bouncycastle they want (FIPS or FOSS) explicitly.
- upgrade tk-jetty9 to use newer Jetty, changes default supported ciphers
  and removes so-linger-seconds option.
- replaced me.raynes/fs w/ maintained clj-commons/fs, all consumers will
  need to update their dependencies.
- replaced circleci/clj-yaml w/ maintained clj-commons/clj-yaml, all
  consumers will need to update their dependencies.
- update snakeyaml to 1.23, minor breaking changes to Java APIs.

## [1.7.27] (not present in 2.x, 3.x version until here)

- update clj-ldap to 0.2.1 to address an issue with base-64 encoded names

## [3.1.1]

- update clj-shell-utils to version built with openjdk8

## [3.1.0]

- add clj-shell-utils extracted from puppetserver

## [3.0.0]

Breaking changes - ssl-utils API change in `pem->ca-crl`

- Update ssl-utils to 2.0.0 to allow unordered certificate bundle

## [2.7.0]

- update trapperkeeper to fix a bug with error handling
- use clojure 1.10.1
- provide versions of bouncycastle with fips

## [2.6.6]

- add nrepl/nrepl 0.6.0 to move to mainline development for nrepl
- left org.clojure/tools.nrepl to maintain backwards compatibility
- update to Trapperkeeper 2.0.0 to take advantage of nrepl/nrepl

## [2.6.5]

- add the analytics client to the managed dependencies

## [2.6.4]

- update trapperkeeper-webserver-jetty9 to 2.4.1 which only disconnects if the session is still open

## [2.6.3]

- update trapperkeeper-webserver-jetty9 to 2.4.0 which adds disconnect function for websockets

## [2.6.2]

- Update jdbc-utils to 1.2.4, which includes methods for jsonb type PGObject transformations

## [2.6.1]

- Update jvm-ssl-utils to 1.0.2, which updates BouncyCastle, fixing a security issue

## [2.6.0]

- downgrade dynapath from 1.0.0 to 0.2.5 (See SERVER-2421).
- update trapperkeeper-authorization to 1.0.0, which brings in the ability to specify rules based on RBAC permissions. NOTE: this is not a breaking update.

## [2.5.0]

- update clojure to 1.10.0.
- update dynapath to allow compilation on jdk8 but operation on later java versions.
- update jackson-databind to 2.9.8, fixing several security vulnerabilities

## [2.4.2]

- update clj-rbac-client to 0.9.4 for wrap-cert-only-access authentication middleware.

## [2.4.1]

- update trapperkeeper-webserver-jetty9 to 2.3.1 which suppresses Jetty's default behavior of reporting its version in the server headers.
- update clj-rbac-client to 0.9.3, the first public release of the library

## [2.4.0]

- update trapperkeeper-scheduler to 1.1.0 which adds support for interval based scheduling

## [2.3.6]

- update trapperkeeper-scheduler to 1.0.1 to exclude c3p0 dependency

## [2.3.5]

- update clj-rbac-client to 0.9.2 to increase the number of concurrent request the client will make to activity and rbac services

## [2.3.4]

- update trapperkeeper-scheduler to 1.0.0 to use the quartz scheduler instead of at-at internally.

## [2.3.3]

- update ring-middleware to 1.0.1 for better logging of uncaught exceptions

## [2.3.2]

- update tk-metrics to 1.2.0 for new jolokia version

## [2.3.1]

- Update `ssl-utils` to 1.0.1

## [2.3.0]

- Update `metrics-clojure` from 2.6.1 to 2.10.0
- Update `tk-jetty-version` from 2.2.0 to 2.3.0
- Add `medley` at version 1.0.0

## [2.2.0]

- Update `org.apache.commons/commons-compress` from 1.8 to 1.17
- Update `prismatic/schema` from 1.1.1 to 1.1.9
- Update `liberator` from 0.12.0 to 0.15.2

## [2.1.1]

- update clj-ldap to 0.2.0 to bring in some new versions of dependencies.

## [2.1.0]

- Update `trapperkeeper-webserver-jetty9` to 2.2.0
  (updates Jetty to 9.4.11-20180605)
- Update jdbc-util to 1.2.3 to fix some migration / restart issues seen in testing

## [2.0.7]

- Update `rbac-client` to 0.9.1 that adds a new function `subject` to the consumer protocol and remote implementation

## [2.0.6]

- Update `jdbc-util` to 1.2.2
- update `org.clojure/java.jdbc` to 0.7.7

## [2.0.5]

- Update `jdbc-util` to 1.2.1

## [2.0.4]

- Update `jdbc-util` to 1.2.0

## [2.0.3]

- Update `trapperkeeper-status` to 1.1.0

## [2.0.2]

- Update `puppetlabs/rbac-client-version` to 0.9.0

## [2.0.1]

- Update `janino` to version 3.0.8
- Update `ssl-utils` to version 1.0.0

## [2.0.0]

Breaking changes -- new version of clojure and changes to ring-mock.

- update clojure to 1.9
- update logback to 1.2.3
- update org.clojure namespaced dependencies to the latest versions
- move from ring-mock to the new namespaced ring/ring-mock version
- update ring-defaults to the latest version
- update postgresql to latest patch version

## [1.7.26]

- update trapperkeeper to fix a bug with error handling

## [1.7.25]

- update trapperkeeper to 2.0.0, which makes use of the updated nrepl

## [1.7.24]

- add nrepl/nrepl 0.6.0 to move to mainline development for nrepl
- left org.clojure/tools.nrepl to maintain backwards compatibility
- update to Trapperkeeper 2.0.0 to take advantage of nrepl/nrepl

## [1.7.22]

- update trapperkeeper-webserver-jetty9 to 2.4.1 which includes a `disconnect` function for disconnecting websocket connections

## [1.7.21]

- Update jvm-ssl-utils to 1.0.2, which updates BouncyCastle, fixing a security issue

## [1.7.20]

- update trapperkeeper-authorization to 1.0.0, which brings in the ability to specify rules based on RBAC permissions. NOTE: this is not a breaking update.

## [1.7.19]

- update jackson-databind to 2.9.8, fixing several security issues

## [1.7.18]

- update trapperkeeper-webserver-jetty9 to 2.3.1 which suppresses Jetty's default behavior of reporting its version in the server headers.

## [1.7.17]

- update trapperkeeper-webserver-jetty9 to 2.3.0, which fixes some security vulnerabilities

## [1.7.16]

- update clj-rbac-client to 0.8.4 to increase the maximum number of simultaneous connections

## [1.7.15]

- update ring-middleware to 1.0.1 for better logging of uncaught exceptions

## [1.7.14]

- update tk-metrics to 1.2.0 for new jolokia version
- update ssl-utils to 1.0.1 for new SAN ext. parsing

## [1.7.13]

- update clj-http client to 1.0.0 to take advantage of the new persistent client options

## [1.7.12]

- update clj-ldap to 0.2.0 to bring in new versions of dependencies

## [1.7.11]

- update jdbc-util to 1.2.3 to prevent partial migration failure

## [1.7.10]

- update jdbc-util to 1.2.2, and java-jdbc to 0.7.7

## [1.7.9]

- Update clj-rbac-client to add `subject` to the consumer service protocol

## [1.7.8]

- Update trapperkeeper-status to 1.1.0

## [1.7.7]

- Update clj-rbac-client with list-permitted-for method

## [1.7.6]

- Update trapperkeeper to 1.5.6, which causes SIGHUP to be logged at INFO level instead of debug

## [1.7.5]

- Update clj-ldap to 0.1.6

## [1.7.4]

- Add the clj-ldap library

## [1.7.3]

- Update Jackson to 2.9.4 and pull in the Jackson Afterburner module for use with JrJackson.

## [1.7.2]

- Update jdbc-util to 1.1.1 to fix issue with pglogical activated during migrations.

## [1.7.1]

- Update trapperkeeper-webserver-jetty9 to 2.1.2, which enables gzipping of POST request responses

## [1.7.0]

- Update for Java 9 compatibility, minor version bump because some of these are feature releases
- Update `puppetlabs/jdbc-util` to version 1.1.0
- Update `org.postgresql/postgresql` to version 42.2.0
- Update `com.zaxxer/HikariCP` to version 2.7.4
- Update `org.cojure/java.jdbc` to version 0.7.5
- Update `puppetlabs/trapperkeeper` to version 1.5.5
- Update `puppetlabs/clj-kitchensink` to version 2.5.2

## [1.6.2]

- update bidi to 2.1.3, which avoids a bug when parsing URIs with spaces. Also update comidi to 0.3.2, to be compatible with the new bidi.

## [1.6.1]

- update `com.fasterxml.jackson.core/jackson-databind` to 2.9.1 which remediates CVE-2017-15095

## [1.6.0]

- update `puppetlabs/trapperkeeper-status` to version 1.0.0 which includes additional metrics reporting
- update `puppetlabs/trapperkeeper-webserver-jetty9` to version 2.1.1 which appropriately denies content renegotiation.

## [1.5.1]

- update `puppetlabs/jdbc-util` to version 1.0.3 which includes updates for the postgres driver and HikariCP
- add a depdendecy to 'org.postgres/postgres' version 42.1.4

## [1.5.0]

- Update `puppetlabs/rbac-client-version` to version 0.8.1
- Breaking change: the new version of the rbac client includes a new method within the RbacConsumerService protocol, and dependent projects will require updating to accommodate for it.

## [1.4.3]

- Update `puppetlabs/clj-kitchensink` to version 2.5.0
- Update `puppetlabs/trapperkeeper` to version 1.5.3

## [1.4.2]

- Add `jackson-databind` at version 2.9.0
- Update `puppetlabs/rbac-client` to version 0.7.1

## [1.4.1]

- Update `trapperkeeper-webserver-jetty9` to version 2.1.0

## [1.4.0]

- Update `cheshire` to 5.8.0
- Update `jackson-core` to 2.9.0
- Update trapperkeeper-filesystem-watcher to version 1.1.0

## [1.3.2]

- Update puppetlabs/clj-kitchensink to version 2.4.0
- Update puppetlabs/jvm-ssl-utils to version 0.9.1

## [1.3.1]

- Update puppetlabs/ssl-utils to version 0.9.0

## [1.3.0] - 2017-07-24

- Add `honeysql` at version 0.6.3
- Update ring/ring-defaults to version 0.3.0. Projects no longer need to exclude `javax.servlet/servlet-api`.

## [1.2.1] - 2017-06-14

- Update puppetlabs/http-client to version 0.9.0
- Update trapperkeeper-metrics to version 1.1.0
- Update puppetlabs/jdbc-util to version 1.0.2

## [1.2.0] - 2017-06-12

- Update io.dropwizard.metrics/metrics-core to version 3.2.2
- Add io.dropwizard.metrics/metrics-graphite locked to the same version as metrics-core
- Update puppetlabs/jdbc-util to version 1.0.1

## [1.1.0] - 2017-05-19

- Add `metrics-clojure` at version 2.6.1.
- Add `org.ow2.asm/asm-all` at version 5.0.3.

## [1.0.0] - 2017-05-17

- Add `com.taoensso/nippy` at version 2.10.0.
- Update `trapperkeeper-webserver-jetty9` to version 2.0.1.

*Note*: The `trapperkeeper-webserver-jetty9` bump also bumps the underlying
Jetty version from 9.2.10 to 9.4.4.  Both tk-webserver-jetty9 and Jetty
9.4.x are built using JDK 8 whereas earlier versions were built using JDK 7.

## [0.8.1] - 2017-05-11

- Add `structured-logging` at version 0.2.0
- Add `instaparse` at version 1.4.1
- Add `bidi` at version 2.0.12
- Add `commons-logging` at version 1.2
- Add `commons-beanutils` at version 1.9.2
- Add `commons-collections` at version 3.2.2

## [0.8.0] - 2017-04-27
- Update `jdbc-util` to 1.0.0
- Add `com.zaxxer/HikariCP` at version 2.6.1

*Note*: jdbc-util requires jdk8

## [0.7.1] - 2017-04-20
- Update `cheshire` to 5.7.1
- Update `jackson-core` to 2.8.6
- Update `jdbc-util` to 0.6.2
- Update `rbac-client` to 0.7.0

Cheshire had a bug that was fixed: https://github.com/dakrone/cheshire/issues/112.
The updates to jdbc-util include some new functions to create databases.

## [0.7.0] - 2017-04-12

- Update `clj-kitchensink` to 2.3.0
- Update `snakeyaml` to 1.18
- Add a test jar for `puppetlabs/rbac-client`

Note that the snakeyaml bump contains some minor breaking changes, which may
affect users who use snakeyaml without clj-yaml.

## [0.6.1] - 2017-03-23

Merges up 0.4.5:
- Updates `puppetlabs/rbac-client` to 0.6.2.
- Updates `puppetlabs/jdbc-util` to 0.6.1.

## [0.6.0] - 2017-03-22

- Updates `puppetlabs/i18n` to 0.8.0
- Adds `circleci/clj-yaml` 0.5.5
- Updates `puppetlabs/jdbc-util` to 0.6.0
- Adds `puppetlabs/rbac-client` 0.6.1

This is a Y release due to the replacement of `clj-yaml` with
`circleci/clj-yaml`.

## [0.5.0] - 2017-03-13

- Adds dependency for `io.dropwizard.metrics/metrics-core` 3.1.2
- Updates `puppetlabs/trapperkeeper-metrics` to 1.0.0
- Updates `puppetlabs/i18n` to 0.7.0
- Removes dependency on `puppetlabs/pe-trapperkeeper-metrics`

It should be noted that `puppetlabs/trapperkeeper-metrics` 1.0.0 introduces
some breaking changes in the `metrics` section of its trapperkeeper
configuration. Projects which require `trapperkeeper-metrics` will need to be
updated. See the [documentation](https://github.com/puppetlabs/trapperkeeper-metrics/blob/1.0.0/documentation/configuration.md)
for details

## [0.4.5] - 2017-03-23

- Updates `puppetlabs/rbac-client` to 0.6.2.
- Updates `puppetlabs/jdbc-util` to 0.6.1.

## [0.4.4] - 2017-03-22

- Updates `puppetlabs/i18n` to 0.8.0.

## [0.4.3] - 2017-03-20

- Updates `puppetlabs/i18n` to 0.7.1.

## [0.4.2] - 2017-03-17

- Backports `puppetlabs/i18n` 0.7.0 to clj-parent `0.4.x` line.

## [0.4.1] - 2017-02-10

- Updates `puppetlabs/http-client` to 0.8.0.

## [0.4.0] - 2017-02-08

- Updates `logback` to 1.1.9.
- Updates `clj-kitchensink` to 2.2.0.
- Updates `trapperkeeper-metrics` to 0.6.0.
- Updates `pe-trapperkeeper-metrics` to 0.3.0.

## [0.3.3] - 2017-01-24

- Updates `trapperkeeper-webserver-jetty9` to 1.7.0.
- Updates `clj-i18n` to 0.6.0.

## [0.3.2] - 2017-01-17

- Updates 'trapperkeeper-webserver-jetty9' to 1.6.0.
- Updates 'trapperkeeper-scheduler' to 0.1.0.
- Updates 'trapperkeeper-status' to 0.7.1.

## [0.3.1] - 2017-01-05

- Updates org.apache.httpcomponents/http-client to 4.5.2.

Adds the following new dependencies:

- java.classpath 0.2.3
- java.jdbc 0.6.2-alpha3
- core.cache 0.6.5
- core.memoize 0.5.9
- data.priority-map 0.0.7
- org.apache.commons/commons-lang3 3.4
- org.apache.httpcomponents/httpcore 4.4.5
- quoin 0.1.2
- stencil 0.5.0

## [0.3.0] - 2016-12-16

- Updates `trapperkeeper-metrics` to 0.5.0.
- Updates `trapperkeeper-status` to 0.7.0.
- Updates `puppetlabs/i18n` to 0.5.1.

## [0.2.5] - 2016-12-07

- Updates clj-http-client to version 0.7.0.

## [0.2.4] - 2016-11-16

- Updates jvm-ssl-utils to version 0.8.3.
- Updates tk-status to version 0.6.0.
- Introduces ring/ring-defaults at 0.2.0.
- Introduces puppetlabs/trapperkeeper-metrics at 0.4.2.

## [0.2.3] - 2016-11-08

- Adds org.clojure/clojurescript at version 1.7.122.

## [0.2.2] - 2016-11-08

- Updates puppetlabs/dujour-version-check to 0.2.1.

## [0.2.1] - 2016-11-07

- Adds org.apache.commons/commons-compress, at version 1.8.

## [0.2.0] - 2016-11-07

- Updates puppetlabs/kitchensink to 2.1.0; this is a major version
  bump of kitchensink due to the change in the schema of the slingshot
  exceptions (from 'type'/'message' to 'kind'/'msg', to match other PL
  HTTP APIs).
- Updates org.clojure/tools.cli from 0.3.3 to 0.3.4
- Updates ring/ring-json from 0.3.1 to 0.4.0

## [0.1.9] - 2016-11-04

Adds the following new dependencies:

- pe-trapperkeeper-metrics 0.2.1
- org.clojure/data.json 0.2.6
- org.yaml/snakeyaml 1.13
- org.apache.maven.wagon/wagon-provider-api 2.10
- org.apache.httpcomponents/httpclient 4.5.1
- clj-stacktrace 0.2.8
- ring/ring-json 0.3.1
- org.tcrawley/dynapath 0.2.4
- trptcolin/versioneer 0.2.0
- trapperkeeper-filesystem-watcher 1.0.1
- trapperkeeper-comidi-metrics 0.1.1
- cljs-dashboard-widgets 0.1.0

## [0.1.8] - 2016-11-01
- Updated jdbc-util to 0.5.0
- Update dujour-version-check to 0.1.8

## [0.1.7] - 2016-10-26
- Updated jvm-ssl-utils to 0.8.2.

## [0.1.6] - 2016-10-26
- Updated commons-codec to 1.10 and ring-servlet to 1.5.0.

## [0.1.5] - 2016-10-25
- Updated compojure to 1.5.0 and trapperkeeper-status to 0.5.0.
- Added jdbc-util, version 0.4.15.

## [0.1.4] - 2016-10-07
- Updated tools.logging to 0.3.1 and tools.macro to 0.1.5.

## [0.1.3] - 2016-10-05
- KS version was incorrectly set to 1.3.2, fixed to 1.4.0.

## [0.1.2] - 2016-10-05
- TK version was incorrectly set to 1.5.3, fixed to 1.5.2.

## [0.1.0] - 2016-09-29
- initial release
