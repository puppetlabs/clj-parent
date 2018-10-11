(def clj-version "1.8.0")
(def ks-version "2.5.2")
(def tk-version "1.5.6")
(def tk-jetty-version "2.1.2")
(def tk-metrics-version "1.2.0")
(def logback-version "1.1.9")
(def rbac-client-version "0.8.4")
(def dropwizard-metrics-version "3.2.2")

(defproject puppetlabs/clj-parent "1.7.16"
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort

  :managed-dependencies [[org.clojure/clojure ~clj-version]
                         [org.clojure/clojurescript "1.7.122"]
                         [org.clojure/tools.logging "0.3.1"]
                         [org.clojure/tools.cli "0.3.4"]
                         [org.clojure/tools.nrepl "0.2.6"]
                         [org.clojure/tools.macro "0.1.5"]
                         [org.clojure/java.classpath "0.2.3"]
                         [org.clojure/java.jdbc "0.7.7"]
                         [org.clojure/java.jmx "0.3.1"]
                         [org.clojure/core.async "0.2.391"]
                         [org.clojure/core.cache "0.6.5"]
                         [org.clojure/core.memoize "0.5.9"]
                         [org.clojure/tools.reader "1.0.0-beta2"]
                         [org.clojure/tools.namespace "0.2.10"]
                         [org.clojure/data.json "0.2.6"]
                         [org.clojure/data.priority-map "0.0.7"]

                         [org.slf4j/log4j-over-slf4j "1.7.20"]
                         [org.slf4j/slf4j-api "1.7.20"]
                         [ch.qos.logback/logback-classic ~logback-version]
                         [ch.qos.logback/logback-core ~logback-version]
                         [ch.qos.logback/logback-access ~logback-version]
                         [net.logstash.logback/logstash-logback-encoder "4.7"]
                         [org.codehaus.janino/janino "2.7.8"]
                         [com.fasterxml.jackson.core/jackson-core "2.9.4"]
                         [com.fasterxml.jackson.core/jackson-databind "2.9.4"]
                         [com.fasterxml.jackson.module/jackson-module-afterburner "2.9.4"]
                         [org.yaml/snakeyaml "1.18"]

                         [org.apache.maven.wagon/wagon-provider-api "2.10"]
                         [org.apache.commons/commons-exec "1.3"]
                         [org.apache.commons/commons-compress "1.8"]
                         [org.apache.commons/commons-lang3 "3.4"]
                         [org.apache.httpcomponents/httpclient  "4.5.2"]
                         [org.apache.httpcomponents/httpcore  "4.4.5"]
                         [commons-beanutils "1.9.2"]
                         [commons-codec "1.10"]
                         [commons-collections "3.2.2"]
                         [commons-lang "2.6"]
                         [commons-logging "1.2"]
                         [commons-io "2.4"]
                         [joda-time "2.8.2"]

                         [com.taoensso/nippy "2.10.0"]

                         [bidi "2.1.3"]
                         [clj-time "0.11.0"]
                         [circleci/clj-yaml "0.5.5"]
                         [clj-stacktrace "0.2.8"]
                         [com.zaxxer/HikariCP "2.7.4"]
                         [me.raynes/fs "1.4.6"]
                         [instaparse "1.4.1"]
                         [slingshot "0.12.2"]
                         [cheshire "5.8.0"]
                         [compojure "1.5.0"]
                         [quoin "0.1.2"]
                         [ring/ring-servlet "1.5.0"]
                         [ring/ring-core "1.4.0"]
                         [ring/ring-codec "1.0.0"]
                         [ring/ring-json "0.4.0"]
                         [ring-basic-authentication "1.0.5"]
                         [ring-mock "0.1.5"]
                         [ring/ring-defaults "0.3.0"]
                         [stencil "0.5.0"]
                         [beckon "0.1.1"]
                         [hiccup "1.0.5"]
                         [liberator "0.12.0"]
                         [org.tcrawley/dynapath "0.2.4"]
                         [trptcolin/versioneer "0.2.0"]
                         [io.dropwizard.metrics/metrics-core ~dropwizard-metrics-version]
                         [io.dropwizard.metrics/metrics-graphite ~dropwizard-metrics-version]
                         [metrics-clojure "2.6.1"]
                         [org.ow2.asm/asm-all "5.0.3"]
                         [honeysql "0.6.3"]
                         [org.postgresql/postgresql "42.2.0"]

                         [prismatic/plumbing "0.4.2"]
                         [prismatic/schema "1.1.1"]

                         [puppetlabs/http-client "1.0.0"]
                         [puppetlabs/jdbc-util "1.2.3"]
                         [puppetlabs/typesafe-config "0.1.5"]
                         [puppetlabs/ssl-utils "1.0.1"]
                         [puppetlabs/clj-ldap "0.2.0"]
                         [puppetlabs/kitchensink ~ks-version]
                         [puppetlabs/kitchensink ~ks-version :classifier "test"]
                         [puppetlabs/trapperkeeper ~tk-version]
                         [puppetlabs/trapperkeeper ~tk-version :classifier "test"]
                         [puppetlabs/trapperkeeper-webserver-jetty9 ~tk-jetty-version]
                         [puppetlabs/trapperkeeper-webserver-jetty9 ~tk-jetty-version :classifier "test"]
                         [puppetlabs/trapperkeeper-metrics ~tk-metrics-version]
                         [puppetlabs/trapperkeeper-metrics ~tk-metrics-version :classifier "test"]
                         [puppetlabs/trapperkeeper-authorization "0.7.0"]
                         [puppetlabs/trapperkeeper-scheduler "0.1.0"]
                         [puppetlabs/trapperkeeper-status "1.1.0"]
                         [puppetlabs/trapperkeeper-filesystem-watcher "1.1.0"]
                         [puppetlabs/structured-logging "0.2.0"]
                         [puppetlabs/ring-middleware "1.0.1"]
                         [puppetlabs/dujour-version-check "0.2.1"]
                         [puppetlabs/comidi "0.3.2"]
                         [puppetlabs/trapperkeeper-comidi-metrics "0.1.1"]
                         [puppetlabs/i18n "0.8.0"]
                         [puppetlabs/cljs-dashboard-widgets "0.1.0"]
                         [puppetlabs/rbac-client ~rbac-client-version]
                         [puppetlabs/rbac-client ~rbac-client-version :classifier "test"]
                         ]

  :dependencies [[org.clojure/clojure]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]
                        ["snapshots" "http://nexus.delivery.puppetlabs.net/content/repositories/snapshots/"]])
