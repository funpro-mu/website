(ns funpro-mu.views
  (:require [funpro-mu.components.header :as header]))

(defn about
  []
  [:section#about-us.mt-36.px-36.lg:flex.w-full.h-screen.scroll-margin-top.snap-start
   [:div.relative.pb-2-3
    [:img {:src "img/ian-schneider-TamMbr4okv4-unsplash-small.jpg"
           :alt "Passion led us"}]]
   [:div.mx-auto
    [:h2.text-4xl "Who we are ?"]
    [:p.max-w-sm "We aim to be a community for sharing around topics relatively close to functional programming
 principle and methods of Software Development."]]])

(defn vision
  []
  [:section#our-vision.mt-36.px-36.flex.w-full.h-screen.scroll-margin-top.snap-start
   [:div.relative.pb-2-3
    [:img {:src "img/kyle-glenn--f8ssjFhD1k-unsplash.jpg"
           :alt "Always room to grow"}]]
   [:div.mx-auto
    [:h2.text-4xl "Moving forward"]
    [:p.max-w-sm.text-justify "Our vision is to share knowledge among people with similar interest while growing together."]]])

(defn home
  []
  [:<>
   [header/header]
   [:div.bg-ebony-clay.text-twilight-blue.max-h-screen.overflow-y-scroll.snap.snap-y.snap-mandatory
    [about]
    [vision]]])
