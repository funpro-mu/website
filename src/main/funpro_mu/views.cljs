(ns funpro-mu.views
  (:require [funpro-mu.components.header :as header]
            [funpro-mu.components.hero :as hero]
            [funpro-mu.components.page :as page]))


(defn welcome
  []
  [page/page
   {:id "welcome"
    :direction :center}
   [hero/hero]])


(defn about
  []
  [page/page
   {:id "about-us"
    :padding? true
    :direction :left
    :image "img/ian-schneider-TamMbr4okv4-unsplash-small.jpg"
    :image-alt-text "Passion led us"
    :heading "Who we are?"}
   [:div.max-w-sm.leading-loose
    [:p.mb-3
     "We aim to be a community for sharing around topics relatively close to functional programming principle and methods of Software Development."]

    [:p.mb-3
     "Mauritius Functional Programmers Community."]

    [:p.mb-3
     [:strong "Met coincidentally"] " on LinkedIn because of a mutual interest in Clojure especially in Mauritius."]

    [:p.mb-3
     "Got to talking and wondered if there are more developers and if we could convince other developers to try Clojure."
     "We initially targeted a Clojure community initiative but decided to be more diverse."]]])


(defn vision
  []
  [page/page
   {:id "vision"
    :padding? true
    :direction :right
    :image "img/kyle-glenn--f8ssjFhD1k-unsplash.jpg"
    :image-alt-text "Always room to grow"
    :heading "Moving forward"}
   [:div.max-w-sm.leading-loose
    [:p.mb-3
     "Our vision is to share knowledge among people with similar interest while growing together."]

    [:ul.list-disc
     [:li.mb-3
      "Our vision is to create a community around functional programming to " [:strong "attract like-minded"] " people to share and grow together."]

     [:li.mb-3
      "Mauritius has great potential to " [:strong "cultivate and attract talent"] "."
      "The lack of technological profoundness (lack of opportunities) in the Island may be a barrier for some people."
      "We can nurture local talent through community initiatives."]

     [:li.mb-3
      "Some brilliant people may also be bored by the technology they are currently using but can't "
      [:strong "convince"] " their colleagues to use " [:strong "easier & advanced techniques and methods"] "."]

     [:li.mb-3
      "The idea is to create an environment where:"

      [:ul.list-disc.ml-8
       [:li.mb-3
        "businesses (remote and local companies), talent acquisition services, and the community grow together to "
        "create an ecosystem that generates high-leverage value-added products/services."]

       [:li.mb-3
        "we learn, grow together and have fun as a software development community to make really cool things happen. (career, upskilling, community...)"]]]]]])


(def ^:private snap-classes "snap snap-y snap-mandatory")


(defn home
  []
  [:<>
   [header/header]
   [:div {:class (str snap-classes " bg-ebony-clay text-twilight-blue max-h-screen overflow-y-scroll")}
    [welcome]
    [about]
    [vision]]])
