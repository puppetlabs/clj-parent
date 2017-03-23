(def clj-version "1.8.0")
(def ks-version "2.2.0")
(def tk-version "1.5.2")
(def tk-jetty-version "1.7.0")
(def tk-metrics-version "1.0.0")
(def logback-version "1.1.9")

(defproject puppetlabs/clj-parent "0.6.1-SNAPSHOT"
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
                         [org.clojure/java.jdbc "0.6.2-alpha3"]
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
                         [com.fasterxml.jackson.core/jackson-core "2.7.3"]
                         [org.yaml/snakeyaml "1.13"]

                         [org.apache.maven.wagon/wagon-provider-api "2.10"]
                         [org.apache.commons/commons-exec "1.3"]
                         [org.apache.commons/commons-compress "1.8"]
                         [org.apache.commons/commons-lang3 "3.4"]
                         [org.apache.httpcomponents/httpclient  "4.5.2"]
                         [org.apache.httpcomponents/httpcore  "4.4.5"]
                         [commons-codec "1.10"]
                         [commons-lang "2.6"]
                         [commons-io "2.4"]
                         [joda-time "2.8.2"]

                         [clj-time "0.11.0"]
                         [circleci/clj-yaml "0.5.5"]
                         [clj-stacktrace "0.2.8"]
                         [me.raynes/fs "1.4.6"]
                         [slingshot "0.12.2"]
                         [cheshire "5.6.1"]
                         [compojure "1.5.0"]
                         [quoin "0.1.2"]
                         [ring/ring-servlet "1.5.0"]
                         [ring/ring-core "1.4.0"]
                         [ring/ring-codec "1.0.0"]
                         [ring/ring-json "0.4.0"]
                         [ring-basic-authentication "1.0.5"]
                         [ring-mock "0.1.5"]
                         ;; ring-defaults brings in a bad, old version of the servlet-api, which
                         ;; now has a new artifact name (javax.servlet/javax.servlet-api).  If we
                         ;; don't exclude the old one here, they'll both be brought in, and consumers
                         ;; will be subject to the whims of which one shows up on the classpath first.
                         ;; thus, we need to use exclusions here, even though we'd normally resolve
                         ;; this type of thing by just specifying a fixed dependency version.
                         [ring/ring-defaults "0.2.0" :exclusions [javax.servlet/servlet-api]]
                         [stencil "0.5.0"]
                         [beckon "0.1.1"]
                         [hiccup "1.0.5"]
                         [liberator "0.12.0"]
                         [org.tcrawley/dynapath "0.2.4"]
                         [trptcolin/versioneer "0.2.0"]
                         [io.dropwizard.metrics/metrics-core "3.1.2"]

                         [prismatic/plumbing "0.4.2"]
                         [prismatic/schema "1.1.1"]

                         [puppetlabs/http-client "0.8.0"]
                         [puppetlabs/jdbc-util "0.6.1"]
                         [puppetlabs/typesafe-config "0.1.5"]
                         [puppetlabs/ssl-utils "0.8.3"]
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
                         [puppetlabs/trapperkeeper-status "0.7.1"]
                         [puppetlabs/trapperkeeper-filesystem-watcher "1.0.1"]
                         [puppetlabs/ring-middleware "1.0.0"]
                         [puppetlabs/dujour-version-check "0.2.1"]
                         [puppetlabs/comidi "0.3.1"]
                         [puppetlabs/trapperkeeper-comidi-metrics "0.1.1"]
                         [puppetlabs/i18n "0.8.0"]
                         [puppetlabs/cljs-dashboard-widgets "0.1.0"]
                         [puppetlabs/rbac-client "0.6.2"]
                         ]

  :dependencies [[org.clojure/clojure]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]
                        ["snapshots" "http://nexus.delivery.puppetlabs.net/content/repositories/snapshots/"]])
