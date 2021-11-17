(defproject journeyman-cc/climate-game "0.1.0-SNAPSHOT"
  :description "A game about avoiding climate catastrophe"
  :license {:name "GNU General Public License,version 2.0 or (at your option) any later version"
            :url "https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot climate-game.core
  :plugins [[lein-cloverage "1.2.2"]
            [lein-codox "0.10.7-cloverage"]]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}
  :target-path "target/%s"
  :url "http://example.com/FIXME"
  
  )
