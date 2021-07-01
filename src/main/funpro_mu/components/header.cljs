(ns funpro-mu.components.header
  (:require [funpro-mu.components.logo :as logo]
            [funpro-mu.components.navbar :as navbar]
            [funpro-mu.components.hamburger :as hamburger]))

(defn header
  []
  [:div.absolute.w-full.bg-black-pearl.z-10
   [:div.max-w-screen-xl.mx-auto
    [:div.mx-6.my-6.flex.justify-between.items-center
     [logo/logo]
     [navbar/navbar]
     [hamburger/hamburger]]]])
