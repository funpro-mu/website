(ns funpro-mu.views)

(defn menu-item
  [link title]
  [:a.hover:text-amber {:href link} title])

(defn navbar
  []
  [:nav.flex.flex-row.justify-between.space-x-12.py-9.px-6
   [menu-item "#" "Home"]
   [menu-item "/#about-us" "Who we are"]
   [menu-item "/#our-vision" "Our vision"]
   [menu-item "#" "Blog"]
   [menu-item "#" "Sponsor us"]
   [menu-item "#" "Join us"]])

(defn header
  []
  [:div.absolute.px-24.flex.w-full.bg-black-pearl.z-10
   [:div
    [:a {:href "#", :class "block"}
     [:span {:class "sr-only"} "funpro.mu"]
     [:img {:class "h-16", :src "img/funpro.mu-dark-theme.svg", :alt "Functional Programmers Community Logo", :title "funpro.mu Logo"}]]
   #_[:img.absolute.w-fill.h-fill.object-cover {:src "img/logo-petite-dark-theme.png"
                                                :alt "Logo"}]]
   [navbar]])

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
  [:div.bg-ebony-clay.text-twilight-blue.max-h-screen.overflow-y-scroll.snap.snap-y.snap-mandatory
   [header]
   [about]
   [vision]])
