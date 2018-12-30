(defproject test-clojars-deploy "0.1.0"
  :description "Sample application to test programmatic deployment to CLojars"
  :url "https://github.com/lukeneil/test-clojars-deploy"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot test-clojars-deploy.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})