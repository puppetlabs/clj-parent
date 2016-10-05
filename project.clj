(def clj-version "1.8.0")
(def ks-version "1.4.0")
(def tk-version "1.5.2")
(def tk-jetty-version "1.5.11")
(def logback-version "1.1.7")

(defproject puppetlabs/clj-parent "0.1.3"
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort

  :managed-dependencies [[org.clojure/clojure ~clj-version]
                         [org.clojure/tools.logging "0.2.6"]
                         [org.clojure/tools.cli "0.3.3"]
                         [org.clojure/tools.nrepl "0.2.6"]
                         [org.clojure/tools.macro "0.1.2"]
                         [org.clojure/java.jmx "0.3.1"]
                         [org.clojure/core.async "0.2.391"]
                         [org.clojure/tools.reader "1.0.0-beta2"]
                         [org.clojure/tools.namespace "0.2.10"]

                         [org.slf4j/log4j-over-slf4j "1.7.20"]
                         [org.slf4j/slf4j-api "1.7.20"]
                         [ch.qos.logback/logback-classic ~logback-version]
                         [ch.qos.logback/logback-core ~logback-version]
                         [ch.qos.logback/logback-access ~logback-version]
                         [org.codehaus.janino/janino "2.7.8"]
                         [com.fasterxml.jackson.core/jackson-core "2.7.3"]

                         [org.apache.commons/commons-exec "1.3"]
                         [commons-codec "1.9"]
                         [commons-lang "2.6"]
                         [commons-io "2.4"]
                         [joda-time "2.8.2"]

                         [clj-time "0.11.0"]
                         [clj-yaml "0.4.0"]
                         [me.raynes/fs "1.4.6"]
                         [slingshot "0.12.2"]
                         [cheshire "5.6.1"]
                         [compojure "1.1.8"]
                         [ring/ring-servlet "1.4.0"]
                         [ring/ring-core "1.4.0"]
                         [ring/ring-codec "1.0.0"]
                         [ring-basic-authentication "1.0.5"]
                         [ring-mock "0.1.5"]
                         [beckon "0.1.1"]
                         [hiccup "1.0.5"]
                         [liberator "0.12.0"]

                         [prismatic/plumbing "0.4.2"]
                         [prismatic/schema "1.1.1"]

                         [puppetlabs/http-client "0.5.0"]
                         [puppetlabs/typesafe-config "0.1.5"]
                         [puppetlabs/ssl-utils "0.8.1"]
                         [puppetlabs/kitchensink ~ks-version]
                         [puppetlabs/kitchensink ~ks-version :classifier "test"]
                         [puppetlabs/trapperkeeper ~tk-version]
                         [puppetlabs/trapperkeeper ~tk-version :classifier "test"]
                         [puppetlabs/trapperkeeper-webserver-jetty9 ~tk-jetty-version]
                         [puppetlabs/trapperkeeper-webserver-jetty9 ~tk-jetty-version :classifier "test"]
                         [puppetlabs/trapperkeeper-authorization "0.7.0"]
                         [puppetlabs/trapperkeeper-scheduler "0.0.1"]
                         [puppetlabs/trapperkeeper-status "0.3.5"]
                         [puppetlabs/ring-middleware "1.0.0"]
                         [puppetlabs/dujour-version-check "0.1.2"]
                         [puppetlabs/comidi "0.3.1"]
                         [puppetlabs/i18n "0.4.3"]
                         ]

  :dependencies [[org.clojure/clojure]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]
                        ["snapshots" "http://nexus.delivery.puppetlabs.net/content/repositories/snapshots/"]])
