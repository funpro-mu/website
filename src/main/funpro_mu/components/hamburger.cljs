(ns funpro-mu.components.hamburger
  (:require [reagent.core :as r]
            [funpro-mu.components.menu-items :as menu-items]
            ;;https://activimetrics.com/blog/mdi_and_clojurescript
            ["react-icons/ai" :as ai]
            ["react-icons/gi" :as gi]))

(def visible (r/atom false))

(defn button-classes
  [display?]
  (let [display (if display?
                  "inline-block"
                  "hidden")]
    (str display " md:hidden outline-none border-0 bg-transparent text-gray-200 text-3xl")))

(defn hamburger
  []
  [:<>
   [:button {:class (button-classes (not @visible))
             :on-click #(swap! visible not)}
    [:span.inline-block.mx-auto
     [gi/GiHamburgerMenu]]]
   [:button {:class (button-classes @visible)
             :on-click #(swap! visible not)}
    [ai/AiOutlineCloseSquare]]
   [:nav.flex.flex-col.items-end.absolute.right-0.top-16.bg-black-pearl.h-screen.px-6
    {:class (if @visible "block" "hidden")}
    [menu-items/menu-items "py-2"]]])
