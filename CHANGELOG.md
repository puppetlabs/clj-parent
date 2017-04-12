## [0.6.2] - 2017-04-12

- Updates `clj-kitchensink' to 2.3.0

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
