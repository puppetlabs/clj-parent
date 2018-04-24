## [2.0.0]

Breaking changes -- new version of clojure and changes to ring-mock.

- update clojure to 1.9 
- update logback to 1.2.3
- update org.clojure namespaced dependencies to the latest versions
- move from ring-mock to the new namespaced ring/ring-mock version
- update ring-defaults to the latest version
- update postgresql to latest patch version

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
