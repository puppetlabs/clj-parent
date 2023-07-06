(def clj-version "1.11.1")
(def ks-version "3.2.1")
(def tk-version "3.2.1")
(def tk-jetty-version "4.4.3")
(def tk-metrics-version "1.5.1")
(def logback-version "1.2.9")
(def rbac-client-version "1.1.4")
(def dropwizard-metrics-version "3.2.2")

(defproject puppetlabs/clj-parent "5.3.8-SNAPSHOT"
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort
  :packaging "pom"

  :managed-dependencies [[org.clojure/clojure ~clj-version]
                         [org.clojure/clojurescript "1.10.866"]
                         [org.clojure/tools.logging "1.2.4"]
                         [org.clojure/tools.cli "1.0.206"]
                         [org.clojure/tools.nrepl "0.2.13"]
                         [org.clojure/tools.macro "0.1.5"]
                         [org.clojure/java.classpath "1.0.0"]
                         [org.clojure/java.jdbc "0.7.12"]
                         [org.clojure/java.jmx "1.0.0"]
                         [org.clojure/core.async "1.5.648"]
                         [org.clojure/core.cache "1.0.225"]
                         [org.clojure/core.memoize "1.0.257"]
                         [org.clojure/tools.reader "1.3.6"]
                         ;; recent attempts to update this resulted in failures to build
                         ;; Syntax error compiling at (clojure/tools/namespace/file.clj:65:26).
                         ;; No such var: parse/name-from-ns-decl
                         [org.clojure/tools.namespace "0.2.11"]
                         [org.clojure/data.json "2.4.0"]
                         [org.clojure/data.priority-map "1.1.0"]

                         [org.slf4j/log4j-over-slf4j "1.7.20"]
                         [org.slf4j/slf4j-api "1.7.20"]
                         [org.slf4j/jul-to-slf4j "1.7.20"]
                         [ch.qos.logback/logback-classic ~logback-version]
                         [ch.qos.logback/logback-core ~logback-version]
                         [ch.qos.logback/logback-access ~logback-version]
                         [net.logstash.logback/logstash-logback-encoder "5.0"]
                         [org.codehaus.janino/janino "3.0.8"]
                         [com.fasterxml.jackson.core/jackson-core "2.14.0"]
                         [com.fasterxml.jackson.core/jackson-databind "2.14.0"]
                         [com.fasterxml.jackson.module/jackson-module-afterburner "2.14.0"]
                         [org.yaml/snakeyaml "1.33"]

                         [org.apache.maven.wagon/wagon-provider-api "2.10"]
                         [org.apache.commons/commons-exec "1.3"]
                         [org.apache.commons/commons-compress "1.21"]
                         [org.apache.commons/commons-lang3 "3.4"]
                         [org.apache.httpcomponents/httpclient  "4.5.13"]
                         [org.apache.httpcomponents/httpcore  "4.4.15"]
                         [org.apache.httpcomponents/httpasyncclient "4.1.5"]
                         [commons-beanutils "1.9.4"]
                         [commons-codec "1.15"]
                         [commons-collections "3.2.2"]
                         [commons-lang "2.6"]
                         [commons-logging "1.2"]
                         [commons-io "2.8.0"]
                         [joda-time "2.8.2"]

                         [com.taoensso/nippy "3.1.1"]
                         [com.taoensso/encore "3.9.2"]

                         [nrepl/nrepl "0.6.0"]
                         [bidi "2.1.3"]
                         [clj-time "0.11.0"]
                         [clj-commons/clj-yaml "0.7.2"]
                         [clj-stacktrace "0.2.8"]
                         [com.zaxxer/HikariCP "5.0.1"]
                         [clj-commons/fs "1.6.307"]
                         [instaparse "1.4.1"]
                         [slingshot "0.12.2"]
                         [cheshire "5.10.2"]
                         [compojure "1.5.0"]
                         [quoin "0.1.2"]
                         [ring/ring-servlet "1.8.2"]
                         [ring/ring-core "1.8.2"]
                         [ring/ring-codec "1.1.2"]
                         [ring/ring-json "0.5.1"]
                         [ring-basic-authentication "1.1.0"]
                         [ring/ring-mock "0.4.0"]
                         [stencil "0.5.0"]
                         [beckon "0.1.1"]
                         [hiccup "1.0.5"]
                         [liberator "0.15.2"]
                         [org.tcrawley/dynapath "0.2.5"]
                         [trptcolin/versioneer "0.2.0"]
                         [io.dropwizard.metrics/metrics-core ~dropwizard-metrics-version]
                         [io.dropwizard.metrics/metrics-graphite ~dropwizard-metrics-version]
                         [metrics-clojure "2.10.0"]
                         [org.ow2.asm/asm-all "5.0.3"]
                         ;; Remove once all projects are updated to use honeysql 2.x
                         [honeysql "1.0.461"]
                         [com.github.seancorfield/honeysql "2.3.911"]
                         [org.postgresql/postgresql "42.4.3"]
                         [medley "1.0.0"]
                         [prismatic/plumbing "0.4.2"]
                         [prismatic/schema "1.1.12"]
                         [stylefruits/gniazdo "1.2.1"]

                         [puppetlabs/http-client "2.1.1"]
                         [puppetlabs/jdbc-util "1.4.0"]
                         [puppetlabs/typesafe-config "0.2.0"]
                         [puppetlabs/ssl-utils "3.5.0"]
                         [puppetlabs/clj-ldap "0.4.0"]
                         [puppetlabs/kitchensink ~ks-version]
                         [puppetlabs/kitchensink ~ks-version :classifier "test"]
                         [puppetlabs/trapperkeeper ~tk-version]
                         [puppetlabs/trapperkeeper ~tk-version :classifier "test"]
                         [puppetlabs/trapperkeeper-webserver-jetty9 ~tk-jetty-version]
                         [puppetlabs/trapperkeeper-webserver-jetty9 ~tk-jetty-version :classifier "test"]
                         [puppetlabs/trapperkeeper-metrics ~tk-metrics-version]
                         [puppetlabs/trapperkeeper-metrics ~tk-metrics-version :classifier "test"]
                         [puppetlabs/trapperkeeper-scheduler "1.1.3"]
                         [puppetlabs/trapperkeeper-authorization "1.0.0"]
                         [puppetlabs/trapperkeeper-status "1.1.2"]
                         [puppetlabs/trapperkeeper-filesystem-watcher "1.2.2"]
                         [puppetlabs/structured-logging "0.2.0"]
                         [puppetlabs/ring-middleware "1.3.1"]
                         [puppetlabs/dujour-version-check "1.0.0"]
                         [puppetlabs/comidi "1.0.0"]
                         [puppetlabs/trapperkeeper-comidi-metrics "0.1.1"]
                         [puppetlabs/i18n "0.9.2"]
                         [puppetlabs/cljs-dashboard-widgets "0.1.0"]
                         [puppetlabs/rbac-client ~rbac-client-version]
                         [puppetlabs/rbac-client ~rbac-client-version :classifier "test"]
                         [puppetlabs/analytics-client "1.2.0"]
                         [puppetlabs/clj-shell-utils "1.0.2"]
                         [puppetlabs/jruby-utils "4.0.3"]

                         ;; When these versions change we need to also
                         ;; promote the changes into the PE packaging repo
                         ;; for BC (ie, clj-parent manages these versions for
                         ;; dev and FOSS, PE is managed via packages):
                         ;; https://github.com/puppetlabs/bouncy-castle-vanagon
                         [org.bouncycastle/bcpkix-fips "1.0.6"]
                         [org.bouncycastle/bc-fips "1.0.2.3"]
                         [org.bouncycastle/bctls-fips "1.0.13"]
                         [org.bouncycastle/bcpkix-jdk15on "1.70"]
                         [org.bouncycastle/bctls-jdk15on "1.70"]
                         [org.bouncycastle/bcprov-jdk15on "1.70"]
                         [org.bouncycastle/bcutil-jdk15on "1.70"]
                         ;; bouncy castle renamed the libraries based on jdk8 coverage.
                         ;; the versions for jdk15on can be removed when nothing is
                         ;; using them anymore.
                         [org.bouncycastle/bcpkix-jdk18on "1.71"]
                         [org.bouncycastle/bctls-jdk18on "1.71"]
                         [org.bouncycastle/bcprov-jdk18on "1.71"]
                         [org.bouncycastle/bcutil-jdk18on "1.71"]]

  :dependencies [[org.clojure/clojure]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]
                        ["snapshots" "https://artifactory.delivery.puppetlabs.net/artifactory/list/clojure-snapshots__local/"]])
