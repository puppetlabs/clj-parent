(defproject puppetlabs/clj-parent "0.1.0-SNAPSHOT"
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort

  :managed-dependencies [[org.clojure/clojure "1.8.0"]
                         [org.clojure/tools.logging "0.2.6"]
                         [org.clojure/tools.cli "0.3.3"]

                         [clj-time "0.10.0"]
                         [me.raynes/fs "1.4.6"]
                         [slingshot "0.10.3"]
                         [cheshire "5.3.1"]
                         ]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]
                        ["snapshots" "http://nexus.delivery.puppetlabs.net/content/repositories/snapshots/"]])
