(ns funpro-mu.components.navbar
  (:require [funpro-mu.components.menu-items :as menu-items]))

(defn navbar
  []
  [:nav.flex.flex-row.justify-between.space-x-6.py-9.px-6.hidden.md:block
   [menu-items/menu-items]])


