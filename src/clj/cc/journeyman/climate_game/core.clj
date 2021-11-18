(ns cc.journeyman.climate-game.core
  "Launcher."
  (:require [cc.journeyman.climate-game.planet.geometry :refer [init-planet]]
            [jme-clj.core :refer [add-light-to-root add-to-root app-settings box defsimpleapp generate geo get*
                                  light load-texture material rotate set* sphere start vec3]])
  (:import [cc.journeyman.climate_game ClimateGameApp])
  (:gen-class))


(defn -main
  "This should be pretty simple."
  [& args]
  (let [app (ClimateGameApp.)]
    (try
      (.setSettings app (app-settings true :title "The Climate Game"))
      (start app)
      (catch Exception any
        (println (.getMessage any))
        (println)
        (throw any)))))

