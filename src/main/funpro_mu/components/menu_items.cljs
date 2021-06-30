(ns funpro-mu.components.menu-items)

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
