(ns funpro-mu.components.hamburger
  (:require [reagent.core :as r]
            [funpro-mu.components.menu-items :as menu-items]))

(def visible (r/atom false))

(defn hamburger
  []
  [:<>
   [:button {:class "inline-block md:hidden w-8 h-8 bg-gray-200 text-gray-600 p-1"
             :on-click #(swap! visible not)}
    [:img {:src "img/hamburger.svg"
           :alt "hamburger"}]]
   [:nav.flex.flex-col.items-end.absolute.right-0.top-16.bg-black-pearl.h-screen.px-6
    {:class (if @visible "block" "hidden")}
    [menu-items/menu-items "py-2"]]])
