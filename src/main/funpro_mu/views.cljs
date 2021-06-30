(ns funpro-mu.views)

(defn menu-item
  [link title & [classes]]
  [:a.hover:text-amber.text-sm {:href link :class classes} title])

(defn menu-items
  [& classes]
  [:<>
   [menu-item "#" "Home" classes]
   [menu-item "/#about-us" "Who we are" classes]
   [menu-item "/#our-vision" "Our vision" classes]
   [menu-item "#" "Blog" classes]
   [menu-item "#" "Sponsor us" classes]
   [menu-item "#" "Join us" classes]])

(defn navbar
  []
  [:nav.flex.flex-row.justify-between.space-x-6.py-9.px-6.hidden.md:block
   [menu-items]])

(defn hamburger
  []
  [:<>
   [:button {:class "inline-block md:hidden w-8 h-8 bg-gray-200 text-gray-600 p-1"}
    [:img {:src "img/hamburger.svg"
           :alt "hamburger"}]]
   [:div.flex.flex-col.items-end.absolute.right-0.top-16.bg-black-pearl.h-screen.px-6
    [menu-items "py-2"]]])

(defn logo
  []
  [:div
    [:a {:href "#", :class "block"}
     [:span {:class "sr-only"} "funpro.mu"]
     [:img {:class "hidden md:block h-16" :src "img/funpro.mu-dark-theme.svg" :alt "Functional Programmers Community Logo" :title "funpro.mu Logo"}]
     [:img {:class "block md:hidden h-16" :src "img/logo-petite-dark-theme.png" :alt "Logo"}]]])

(defn header
  []
  [:div.absolute.flex.justify-between.w-full.bg-black-pearl.z-10
   [logo]
   [navbar]
   [hamburger]])

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
