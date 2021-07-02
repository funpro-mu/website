(ns funpro-mu.views
  (:require [funpro-mu.components.header :as header]
            [funpro-mu.components.hero :as hero]))

#_"mt-36 px-36"

(def view-classes "lg:flex w-full h-screen scroll-margin-top snap-start")

(defn welcome
  []
  [:section#welcome {:class view-classes}
   [hero/hero]])

(defn about
  []
  [:section#about-us {:class view-classes}
   [:div.relative.pb-2-3
    [:img {:src "img/ian-schneider-TamMbr4okv4-unsplash-small.jpg"
           :alt "Passion led us"}]]
   [:div.mx-auto
    [:h2.text-4xl "Who we are ?"]
    [:p.max-w-sm "We aim to be a community for sharing around topics relatively close to functional programming
 principle and methods of Software Development."]]])

(defn vision
  []
  [:section#our-vision {:class view-classes}
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
    [welcome]
    [about]
    [vision]]])
