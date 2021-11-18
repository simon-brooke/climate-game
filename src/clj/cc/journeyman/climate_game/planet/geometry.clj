(ns cc.journeyman.climate-game.planet.geometry
  "Intended to replace java/cc/journeyman/cimate_game/ClimateGameApp.java, but not yet working."
  (:require [jme-clj.core :refer [add-light-to-root add-to-root box defsimpleapp geo light material set* start vec3]])
  (:import [aaronperkins.planeteg PlanetMeshGen]))

(defn init-planet
  "Initialise an app with a planet in the centre of the screen. Not yet working."
  []
  (let [generator (PlanetMeshGen.)]
    (.generateHeightmap generator)
    (-> (light :directional)
        (set* :direction (vec3 -0.1 -0.7 -1.0))
        (add-light-to-root))
    (->
     (set* (geo "Planet" (.generateMesh generator))
           :material
           (material "Common/MatDefs/Light/Lighting.j3md"))
     add-to-root)))