(ns cc.journeyman.climate-game.core
  (:require [jme-clj.core :refer [add-to-root box defsimpleapp geo material set* start]])
  (:import [aaronperkins.planeteg PlanetApp]
           [com.jme3.math ColorRGBA Vector3f]
           [com.jme3.app SimpleApplication]
           [com.jme3.scene Geometry]
           [com.jme3.material Material]
           [com.jme3.light DirectionalLight]))

;; (defn init []
;;   (let [box  (box 1 1 1)
;;         geom (geo "Box" box)
;;         mat  (material "Common/MatDefs/Misc/Unshaded.j3md")]
;;     (set* mat :color "Color" ColorRGBA/Blue)
;;     (set* geom :material mat)
;;     (add-to-root geom)))

;; (defsimpleapp app :init init)

(def app (PlanetApp.))

(start app)