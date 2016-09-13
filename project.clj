(def ks-version "1.3.2-SNAPSHOT")
(def tk-version "1.5.1-SNAPSHOT")
(def logback-version "1.1.7")

(defproject puppetlabs/clj-parent "0.1.0-SNAPSHOT"
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort

  :managed-dependencies [[org.clojure/clojure "1.8.0"]
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

                         [commons-codec "1.9"]

                         [clj-time "0.10.0"]
                         [clj-yaml "0.4.0"]
                         [me.raynes/fs "1.4.6"]
                         [slingshot "0.10.3"]
                         [cheshire "5.3.1"]
                         [compojure "1.1.8"]
                         [ring/ring-servlet "1.4.0"]
                         [ring/ring-core "1.4.0"]
                         [ring/ring-codec "1.0.0"]
                         [beckon "0.1.1"]

                         [prismatic/plumbing "0.4.2"]
                         [prismatic/schema "1.0.4"]

                         [puppetlabs/http-client "0.5.0"]
                         [puppetlabs/typesafe-config "0.1.5"]
                         [puppetlabs/ssl-utils "0.8.1"]
                         [puppetlabs/kitchensink ~ks-version]
                         [puppetlabs/kitchensink ~ks-version :classifier "test"]
                         [puppetlabs/trapperkeeper ~tk-version]
                         [puppetlabs/trapperkeeper ~tk-version :classifier "test"]
                         ]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]
                        ["snapshots" "http://nexus.delivery.puppetlabs.net/content/repositories/snapshots/"]])
