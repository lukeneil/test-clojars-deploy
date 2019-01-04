(defproject test-clojars-deploy "0.1.3"
  :description "Sample application to test programmatic deployment to Clojars"
  :url "https://github.com/lukeneil/test-clojars-deploy"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot test-clojars-deploy.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repositories [["releases" {:url "https://repo.clojars.org/"
                              :username :env
                              :password :env}]])
