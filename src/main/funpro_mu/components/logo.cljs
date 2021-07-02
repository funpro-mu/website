(ns funpro-mu.components.logo)

(defn logo
  []
  [:div
   [:a {:href "#", :class "block"}
    [:span {:class "sr-only"} "funpro.mu"]
    [:img {:class "hidden md:block h-16" :src "img/funpro.mu-dark-theme.svg" :alt "Functional Programmers Community Logo" :title "funpro.mu Logo"}]
    [:img {:class "block md:hidden h-12" :src "img/logo-petite-dark-theme.png" :alt "Logo"}]]])
