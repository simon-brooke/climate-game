(ns cc.journeyman.climate-game.core
  "Launcher."
  (:require [cc.journeyman.climate-game.planet.geometry :refer [init-planet]]
            [jme-clj.core :refer [add-light-to-root add-to-root box defsimpleapp generate geo get*
                                  light load-texture material rotate set* sphere start vec3]])
  (:import [cc.journeyman.climate_game ClimateGameApp]))

(def app (ClimateGameApp.))

(start app)