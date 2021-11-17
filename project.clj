(defproject journeyman-cc/climate-game "0.1.0-SNAPSHOT"
  :description "A game about avoiding climate catastrophe"
  :license {:name "GNU General Public License,version 2.0 or (at your option) any later version"
            :url "https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html"}
  :dependencies [[jme-clj "0.1.13"]
                 [com.jme3/jmonkeyengine3 "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-testdata "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-terrain "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-plugins "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-niftygui "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-plugins "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-lwjgl "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-lwjgl-natives "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-jogg "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-jbullet "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-desktop "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-core "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-blender "3.0.0-SNAPSHOT"]
                 [com.jme3/jME3-effects "3.0.0.20121220-SNAPSHOT"]
                 [com.jme3/jME3-networking "3.0.0.20121220-SNAPSHOT"]
                 [com.jme3/j-ogg-oggd "3.0.0-SNAPSHOT"]
                 [com.jme3/j-ogg-vorbisd "3.0.0-SNAPSHOT"]
                 [com.jme3/eventbus "3.0.0-SNAPSHOT"]
                 [com.jme3/jbullet "3.0.0-SNAPSHOT"]
                 [com.jme3/jinput "3.0.0-SNAPSHOT"]
                 [com.jme3/lwjgl "3.0.0-SNAPSHOT"]
                 [com.jme3/nifty "3.0.0-SNAPSHOT"]
                 [com.jme3/nifty-default-controls "3.0.0-SNAPSHOT"]
                 [com.jme3/nifty-style-black "3.0.0-SNAPSHOT"]
                 [com.jme3/nifty-examples "3.0.0-SNAPSHOT"]
                 [com.jme3/noise "3.0.0-SNAPSHOT"]
                 [com.jme3/stack-alloc "3.0.0-SNAPSHOT"]
                 [com.jme3/vecmath "3.0.0-SNAPSHOT"]
                 [com.jme3/xmlpull-xpp3 "3.0.0-SNAPSHOT"]
                 [org.clojure/clojure "1.10.3"]]
  :java-source-paths ["src/java"]
  :main ^:skip-aot cc.journeyman.climate-game.core
  :plugins [[lein-cloverage "1.2.2"]
            [lein-codox "0.10.7-cloverage"]]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}
  :repositories {"oss-sonatype"
                 "https://oss.sonatype.org/content/repositories/snapshots/"}
  :source-paths      ["src/clj"]
  :target-path "target/%s"
  :url "http://example.com/FIXME")
