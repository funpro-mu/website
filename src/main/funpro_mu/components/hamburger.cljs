(ns funpro-mu.components.hamburger
  (:require [reagent.core :as r]
            [funpro-mu.components.menu-items :as menu-items]
            ;;https://activimetrics.com/blog/mdi_and_clojurescript
            ["react-icons/ai" :as ai]
            ["react-icons/gi" :as gi]))

(def menu-visible? (r/atom false))

(defn button-classes
  [display?]
  (let [display (if display?
                  "inline-block"
                  "hidden")]
    (str display " h-6 md:hidden outline-none border-0 bg-transparent text-gray-200 text-3xl")))

(defn hamburger
  []
  [:<>
   [:button {:class (button-classes (not @menu-visible?))
             :on-click #(swap! menu-visible? not)}
    [gi/GiHamburgerMenu]]
   [:button {:class (button-classes @menu-visible?)
             :on-click #(swap! menu-visible? not)}
    [ai/AiOutlineCloseSquare]]
   [:nav.flex.flex-col.items-end.absolute.right-0.top-14.bg-black-pearl.h-screen.px-6.md:hidden
    {:class (if @menu-visible? "block" "hidden")}
    [menu-items/menu-items "py-4"]]])
