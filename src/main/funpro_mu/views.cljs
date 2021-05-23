(ns funpro-mu.views)

(defn header
  []
  [:div.px-24
   [:h1.text-7xl.ml-8.mt-6 "Functional Programmers"]])

(defn about
  []
  [:div.mt-6.px-36.flex
   [:img {:src "img/ian-schneider-TamMbr4okv4-unsplash-small.jpg"
          :alt "Passion led us"}]
   [:div.mx-auto
    [:h2.text-4xl "Who we are ?"]
    [:p.max-w-sm "We aim to be a community for sharing around topics relatively close to functional programming
 principle and methods of Software Development."]]])

(defn vision
  []
  [:div.mt-6.px-36.flex
   [:img {:src "img/kyle-glenn--f8ssjFhD1k-unsplash.jpg"
          :alt "Always room to grow"}]
   [:div.mx-auto
    [:h2.text-4xl "Vision"]
    [:p.max-w-sm.text-justify "Our vision is to share knowledge among people with similar interest while growing together."]]])

(defn home
  []
  [:div
   [header]
   [about]
   [vision]])
