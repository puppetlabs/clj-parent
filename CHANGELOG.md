## [Unreleased]

## [4.9.5]
- update comidi to 1.0.0 to include PATCH macro.
- update httpasync-client to 4.1.5 to fix async issues seen in testing.  https://downloads.apache.org/httpcomponents/httpasyncclient/RELEASE_NOTES-4.1.x.txt
- update httpasync-core to 4.4.15 to fix async issues seen in testing.  https://downloads.apache.org/httpcomponents/httpcore/RELEASE_NOTES-4.4.x.txt (HTTPCORE-687) and "Bug fix: Non-blocking TLSv1.3 connections can end up in an infinite event spin when closed
  concurrently by the local and the remote endpoints." 
- Update ring-json to 0.5.1, which updates dependencies to avoid CVEs and has a small perf improvement

## [4.9.4]
- update pgjdbc (org.postgresql/postgresql) to 42.3.2, which fixes a bug in choosing the correct signing algorithm when used with Bouncy Castle, and addresses CVE-2022-21724

## [4.9.3]
- add honeysql 2.x dependency
- update jruby-utils to 3.2.3, which pins a JRuby dependency to avoid a CVE

## [4.9.2]
- update bouncy-castle to 1.70, which includes improvements to TLS 1.3 support

## [4.9.1]
- update jackson to 2.12.6 to address https://security.snyk.io/vuln/SNYK-JAVA-COMFASTERXMLJACKSONCORE-2326698
- update logback to 1.2.9 to address https://nvd.nist.gov/vuln/detail/CVE-2021-42550

## [4.9.0]
- update honeysql to 1.0.461 to address SQLi vulnerability and distribute latest version to all consuming projects
- update logback to 1.2.7 to address https://security.snyk.io/vuln/SNYK-JAVA-CHQOSLOGBACK-1726923

## [4.8.4]
- update cheshire to 5.10.1 to update the jackson dependencies

## [4.8.3]
- update puppetlabs/http-client to 1.2.4, which is the public version of the previous security release

## [4.8.2]
- update puppetlabs/http-client to 1.2.3 to resolve minor security issue.
- update comidi to 0.3.3, which doesn't include any new content, but should clear up false positives from the Snyk security scanner.

## [4.8.1]
- update tk-jetty9 to 4.2.1, which adds TLS 1.3 support for FIPS

## [4.8.0]
- update tk-jetty9 to 4.2.0, which adds support for TLS 1.3 by default

## [4.7.3]
- update ring-middleware to 1.3.1 to add support for referrer-policy headers to be added.

## [4.7.2]
- update tk-metrics to 1.4.3, which fixes an issue with its Bouncy Castle dependency that caused issues in FIPS mode. This also reintroduces the jolokia 1.7.0 bump (which was not implicated in the FIPS bug).

## [4.7.1]
- revert update to tk-metrics, the previous update caused issues in FIPS environments

## [4.7.0]
- update jdbc to 0.7.11, update jdbc-util to 1.3.0, due to a change in version for migratus

## [4.6.30]
- update tk-metrics to 1.4.1, which includes Jolokia 1.7.0, a routine maintenance bump that cleans up some reflective accesses that trigger warnings in Java 9 and newer.

## [4.6.29]

- update i18n to 0.9.2 which fixes some reflection issues.

## [4.6.28]

- update trapperkeeper-webserver-jetty9 to 4.1.8 to bring in Jetty v9.4.43 to resolve CVE-2021-34429

## [4.6.27]

- update commons-compress to 1.21 to fix several CVEs

## [4.6.26]

- update jvm-ssl-utils to 3.3.0, which now supports OpenSSL-formatted EC private keys
- update tk-jetty9 to 4.1.7, which resolves CVE-2021-28169
- update BC FIPS libraries to latest versions

## [4.6.25]

- update clojurescript to 1.10.866, which resolves CVEs in several transitive dependencies

## [4.6.24]

- update jvm-ssl-utils to 3.2.2, which contains a fix to stay compatible with both FOSS and FIPS Bouncy Castle APIs and some new extension utilities.

## [4.6.23]

- update jvm-ssl-utils to 3.2.0, which contains more advanced CRL utilities

## [4.6.22]

- update apache httpclient to 4.5.13 (CVE-2020-13956)
- update apache httpcore to 4.4.13 to match httpclient
- update commons-io to 2.8.0 (CVE-2021-29425)

## [4.6.21]

- update jruby-utils to 3.2.2, which brings in JRuby 9.2.17.0

## [4.6.20]

- update tk-jetty9 to 4.1.6, which contains a fix for a connection reset bug

## [4.6.19]

- update tk-jetty9 to 4.1.5, which contains several security fixes

## [4.6.18]

- update clj-kitchensink to bring in the addition of the base-type function for parsing Content-Type headers

## [4.6.17]

- update commons-compress to 1.20, which contains a security fix.
- update clj-commons/fs to 1.6.307, which contains a matching commons-compress version

## [4.6.16]

- update commons-beanutils to 1.9.4, which contains a security fix.
- update nippy to 3.1.1, security fixes. May require adjustments to the usage of `thaw`
- update ring-servlet back to 1.8.2 now that our failures have been resolved

## [4.6.15]

- pin ring-servlet back to 1.5.1 until we figure out what is causing binary file test failures

## [4.6.14]

- update tk-jetty9 to 4.1.3, which updates a dependency pin to avoid conflicts with other libs

## [4.6.13]

- update jackson-core, jackson-databind and jackson-module-afterburner to 2.12.1 for security fixes
- update snakeyaml to 1.27, which contains some security fixes
- update clj-yaml to 0.7.2, which will be most compatible with the above version of snakeyaml
- update tk-metrics to 1.4.0, allows remote access to the metrics endpoint
- update tk-jetty9 to 4.1.2, which fixes the artifacts built by the 4.1.1 tag

## [4.6.12]

- update tk-jetty9 to 4.1.1, which contains jetty 9.4.36, a maintenance update with some security fixes
- update bouncy-castle to 1.68, which contains some security fixes

## [4.6.11]

- update clj-typesafe-config to 0.2.0 bringing in typesafe/config 1.4.1, an ABI-compatible feature update from the previous release of 1.2.0.
- update ring dependencies to current latest releases

## [4.6.10]

 - update jruby-utils to 3.2.1 bringing in JRuby 9.2.14.0, a minor update that resolves a webrick CVE.

## [4.6.9]

- update tk-scheduler to 1.1.3, which updates the quartz library to the latest z, and adds checks to
  prevent null functions from being passed to the scheduler

## [4.6.8]

- update ring-middleware to 1.3.0, which updates `wrap-add-cache-headers` to use
  the "no-store" cache-control directive instead of "private, max-age=0, no-cache"

## [4.6.7]

- update clj-kitchensink to 3.1.1, which changes the open-port-num function to select a port
  in the 16384 - 32767 range. This should decrease port binding collisions in some cases.

## [4.6.6]

- update clj-http-client to 1.2.0, which allows retrieving the message from a response status

## [4.6.5]

- update clj-rbac-client to 1.1.1 to fix a bug introduced in 1.1.0

## [4.6.4]

- update clj-rbac-client to 1.1.0 to remove harmful language and add a method to the rbac consumer protocol
- update tk-status to 1.1.1 which includes additional java memory info

## [4.6.3]

- update jvm-ssl-utils to 3.1.0, which contains a function to revoke multiple certs at once

## [4.6.2]

- update prismatic-schema to 1.1.12, which has a few bug fixes
- update jruby-utils to 3.2.0, which updates JRuby to 9.2.13.0

## [4.6.1]

- update clj-rbac-client to 1.0.0 to add support for the activity service v2 submission endpoint

## [4.6.0]

- update bctls-fips to 1.0.10
- update non-FIPS Bouncy Castle to 1.66
- update jvm-ssl-utils to 3.0.5, fixing a bug introduced in BC 1.64
- update ring-middleware to 1.2.0, which includes `wrap-params`,
  which used to live in the puppetserver repo.

## [4.5.5]

- update ring-middleware to 1.1.0, which adds
  new wrappers for use in console-ui.

## [4.5.4]

- update trapperkeeper-metrics to 1.3.1, which adds tk-authorization
  support

## [4.5.3]

- update postgres jdbc driver to 4.2.14, which has security fixes

## [4.5.2]

- update jruby-utils to 3.1.4 which disables invokedynamic.yield
- revert i18n to 0.8.0 as it appeared to be causing problems with
  reloading trapperkeeper

## [4.5.1]

- update i18n to 0.9.0, which removes the plugin hook.

## [4.5.0]

- update trapperkeeper-webserver-jetty9 to 4.1.0, which bumps jetty to 9.4.28 to
  ensure we are on the latest supported version.
- update trapperkeeper-metrics to 1.2.3, which deprecates the v1 metrics endpoint.

## [4.4.5]

- update jruby-utils to 3.1.3, which reverts the JRuby downgrade and brings back 9.2.11.1

## [4.4.4]

- update jruby-utils to 3.1.2, which downgrades JRuby to 9.2.8.0 to avoid a potential bug in 9.2.11.1

## [4.4.3]

- update clj-ldap to 0.3.0, which allows passing an array of trust-managers in the connection options

## [4.4.2]

- update kitchensink to 3.1.0, which contains a function for doing atomic file writes

## [4.4.1]

- update tk-metrics to 1.2.2, which is available on clojars. tk-metrics 1.2.1 was an internal-only release

## [4.4.0]

- update jruby-utils to 3.1.1, which updates JRuby to 9.2.11.1. See commit history for details about the impact of this update on gem installs and docs.
- update trapperkeeper to 3.1.0, which contains support for custom exit statuses

## [4.3.3]

- update trapperkeeper-metrics to 1.2.1, fixes CVE-2020-7943

## [4.3.2]

- update tk-jetty9 to fix a type inference ambiguity in Java 11

## [4.3.1]

- update tk-filesystem-watcher to ignore lock directories that disappear when registering.

## [4.3.0]

- update jruby-utils to 3.0.4 to include the new single-instance jruby pool in support of thread-safe puppet.

## [4.2.11]

- update http-client to 1.1.3 to remove ambiguity around RequestObject construction under java 11

## [4.2.10]

- update com.taoensso/nippy to 2.14.0 in order to address some clojure warnings
- update com.taoensso/encore to 2.115.0

## [4.2.9]

- update org.postgresql/postgresql to 42.2.8 to address a connection closure issue

## [4.2.8]

- update jruby-utils to 2.3.2 to downgrade JRuby to 9.2.8.0 to avoid a bug in 9.2.9.0.

## [4.2.7]

- update jruby-utils to 2.3.1 to support usage of the multithreaded key for JRubyConfig

## [4.2.6]

- updates tk-filesystem-watcher to 1.2.1, which has better error handling
- updates jackson-xml to 2.10 (see PE-27458)
- updates trapperkeeper-webserver-jetty9 to 4.0.2 for logging fixups &
  FIPS cipher-suite changes

## [4.2.5]

- updates dujour-version-check and analytics-client for FIPS & Java 11 support

## [4.2.4]

- update clj-http-client to 1.1.2 to support running in fully restricted
  FIPS mode.
- update trapperkeeper-webserver-jetty9 to 4.0.1 to support running in fully
  restricted FIPS mode. This will also install the SLF4JBridgeHandler at runtime,
  which will forward all java.util.logging calls to SLF4J automatically, meaning
  they can be controlled via the logback configuration files (logback.xml, etc)

## [4.2.3]

- Adds jul-to-slf4j dependency definition for forwarding java.util.logging messages
  to SLF4J. The bouncycastle FIPS provider logs exclusively through java.util.logging.
- Adds httpasyncclient version, as opposed to specifying it directly in clj-http-client.

## [4.2.2]

- update bc-fips to version 1.0.2, which is certified for use with JDK 11.
- adds bctls-fips to support TLS transactions via the bouncycastle provider.

## [4.2.1]

- update jdbc-util to address issues with scheme-migration table
  being creaated on replicas (merge up from 1.7.28 & 2.7.1)

## [4.2.0]

- Update trapperkeeper-webserver-jetty9 to 4.0.0, which further restricts
  the available cipher suites.

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

## [3.1.2]

- update tk-filesystem-watcher to ignore lock directories that disappear when registering.
- update org.postgresql/postgresql to 42.2.8 to address a connection closure issue

## [3.1.1]

- update clj-shell-utils to version built with openjdk8

## [3.1.0]

- add clj-shell-utils extracted from puppetserver

## [3.0.0]

Breaking changes - ssl-utils API change in `pem->ca-crl`

- Update ssl-utils to 2.0.0 to allow unordered certificate bundle

## [2.7.4]
- update tk-filesystem-watcher to ignore lock directories that disappear when registering.

## [2.7.3]

- update tk-filesystem-watcher to 1.1.1, which has improved error handling

## [2.7.2]

- update jackson-xml to 2.10 (see PE-27458)

## [2.7.1]

- merge up changes to jdbc-util and clj-ldap from 1.7.x

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

## [1.7.38]

- update clj-kitchensink to 2.6.0, which adds an function to atomically write files

## [1.7.37]

- update jvm-ssl-utils to 1.1.0, which adds a method for revoking multiple certs

## [1.7.36]

- update postgres jdbc driver to 4.2.14, which has security fixes

## [1.7.35]

- update tk-metrics to 1.2.3, which deprecates the v1 metrics endpoint.

## [1.7.34]

- update tk-metrics to 1.2.2, which is available on clojars. tk-metrics 1.2.1 was an internal-only release

## [1.7.32]

- update trapperkeeper-metrics to 1.2.1, fixes CVE-2020-7943

## [1.7.31]
- update tk-filesystem-watcher to ignore lock directories that disappear when registering.

## [1.7.30]

- update tk-filesystem-watcher to 1.1.1, which has improved error handling

## [1.7.29]

- update jackson-xml to 2.10 (see PE-27458)

## [1.7.28]

- update jdbc-util to address issues with scheme-migration table being creaated on replicas

## [1.7.27]

- update clj-ldap to 0.2.1 to address an issue with base-64 encoded names

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
