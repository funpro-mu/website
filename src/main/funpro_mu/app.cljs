(ns funpro-mu.app
  (:require [reagent.dom :as dom]
            [funpro-mu.views :as views]))

(defn app
  []
  [views/home])

(defn ^:dev/after-load start []
  (dom/render [app]
              (.getElementById js/document "app")))

(defn init []
  (js/console.log "init")
  (start))
