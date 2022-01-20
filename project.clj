(def clj-version "1.10.1")
(def ks-version "3.1.3")
(def tk-version "3.1.0")
(def tk-jetty-version "4.2.1")
(def tk-metrics-version "1.4.3")
(def logback-version "1.2.9")
(def rbac-client-version "1.1.1")
(def dropwizard-metrics-version "3.2.2")

(defproject puppetlabs/clj-parent "4.9.2-SNAPSHOT"
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort
  :packaging "pom"

  :managed-dependencies [[org.clojure/clojure ~clj-version]
                         [org.clojure/clojurescript "1.10.866"]
                         [org.clojure/tools.logging "0.4.0"]
                         [org.clojure/tools.cli "0.3.6"]
                         [org.clojure/tools.nrepl "0.2.13"]
                         [org.clojure/tools.macro "0.1.5"]
                         [org.clojure/java.classpath "0.2.3"]
                         [org.clojure/java.jdbc "0.7.11"]
                         [org.clojure/java.jmx "0.3.4"]
                         [org.clojure/core.async "0.4.490"]
                         [org.clojure/core.cache "0.7.1"]
                         [org.clojure/core.memoize "0.7.1"]
                         [org.clojure/tools.reader "1.2.1"]
                         [org.clojure/tools.namespace "0.2.11"]
                         [org.clojure/data.json "0.2.6"]
                         [org.clojure/data.priority-map "0.0.9"]

                         [org.slf4j/log4j-over-slf4j "1.7.20"]
                         [org.slf4j/slf4j-api "1.7.20"]
                         [org.slf4j/jul-to-slf4j "1.7.20"]
                         [ch.qos.logback/logback-classic ~logback-version]
                         [ch.qos.logback/logback-core ~logback-version]
                         [ch.qos.logback/logback-access ~logback-version]
                         [net.logstash.logback/logstash-logback-encoder "5.0"]
                         [org.codehaus.janino/janino "3.0.8"]
                         [com.fasterxml.jackson.core/jackson-core "2.12.6"]
                         [com.fasterxml.jackson.core/jackson-databind "2.12.6"]
                         [com.fasterxml.jackson.module/jackson-module-afterburner "2.12.6"]
                         [org.yaml/snakeyaml "1.27"]

                         [org.apache.maven.wagon/wagon-provider-api "2.10"]
                         [org.apache.commons/commons-exec "1.3"]
                         [org.apache.commons/commons-compress "1.21"]
                         [org.apache.commons/commons-lang3 "3.4"]
                         [org.apache.httpcomponents/httpclient  "4.5.13"]
                         [org.apache.httpcomponents/httpcore  "4.4.13"]
                         [org.apache.httpcomponents/httpasyncclient "4.1.4"]
                         [commons-beanutils "1.9.4"]
                         [commons-codec "1.10"]
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
                         [com.zaxxer/HikariCP "2.7.4"]
                         [clj-commons/fs "1.6.307"]
                         [instaparse "1.4.1"]
                         [slingshot "0.12.2"]
                         [cheshire "5.10.1"]
                         [compojure "1.5.0"]
                         [quoin "0.1.2"]
                         [ring/ring-servlet "1.8.2"]
                         [ring/ring-core "1.8.2"]
                         [ring/ring-codec "1.1.2"]
                         [ring/ring-json "0.5.0"]
                         [ring-basic-authentication "1.1.0"]
                         [ring/ring-mock "0.4.0"]
                         [ring/ring-defaults "0.3.2"]
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
                         [honeysql "1.0.461"]
                         [org.postgresql/postgresql "42.3.1-fipsfix-SNAPSHOT"]
                         [medley "1.0.0"]

                         [prismatic/plumbing "0.4.2"]
                         [prismatic/schema "1.1.12"]

                         [puppetlabs/http-client "1.2.4"]
                         [puppetlabs/jdbc-util "1.3.0"]
                         [puppetlabs/typesafe-config "0.2.0"]
                         [puppetlabs/ssl-utils "3.3.0"]
                         [puppetlabs/clj-ldap "0.3.0"]
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
                         [puppetlabs/trapperkeeper-status "1.1.1"]
                         [puppetlabs/trapperkeeper-filesystem-watcher "1.2.2"]
                         [puppetlabs/structured-logging "0.2.0"]
                         [puppetlabs/ring-middleware "1.3.1"]
                         [puppetlabs/dujour-version-check "0.2.3"]
                         [puppetlabs/comidi "0.3.3"]
                         [puppetlabs/trapperkeeper-comidi-metrics "0.1.1"]
                         [puppetlabs/i18n "0.9.2"]
                         [puppetlabs/cljs-dashboard-widgets "0.1.0"]
                         [puppetlabs/rbac-client ~rbac-client-version]
                         [puppetlabs/rbac-client ~rbac-client-version :classifier "test"]
                         [puppetlabs/analytics-client "1.0.2"]
                         [puppetlabs/clj-shell-utils "1.0.2"]
                         [puppetlabs/jruby-utils "3.2.2"]

                         ;; When these versions change we need to also
                         ;; promote the changes into the PE packaging repo
                         ;; for BC (ie, clj-parent manages these versions for
                         ;; dev and FOSS, PE is managed via packages):
                         ;; https://github.com/puppetlabs/bouncy-castle-vanagon
                         [org.bouncycastle/bcpkix-fips "1.0.5"]
                         [org.bouncycastle/bc-fips "1.0.2.1"]
                         [org.bouncycastle/bctls-fips "1.0.11.4"]
                         [org.bouncycastle/bcpkix-jdk15on "1.68"]]

  :dependencies [[org.clojure/clojure]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]
                        ["snapshots" "https://artifactory.delivery.puppetlabs.net/artifactory/list/clojure-snapshots__local/"]])
