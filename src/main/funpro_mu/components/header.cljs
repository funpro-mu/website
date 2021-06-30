(ns funpro-mu.components.header
  (:require [funpro-mu.components.logo :as logo]
            [funpro-mu.components.navbar :as navbar]
            [funpro-mu.components.hamburger :as hamburger]))

(defn header
  []
  [:div.absolute.flex.justify-between.w-full.bg-black-pearl.z-10
   [logo/logo]
   [navbar/navbar]
   [hamburger/hamburger]])
