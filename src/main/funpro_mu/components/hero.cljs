(ns funpro-mu.components.hero)

(defn hero []
  [:div
   [:div.absolute.inset-1-2
    ;; We need the heading to have a background
    ;; The heading must not stay on screen when scrolling
    ;; The heading must be in the center and middle of the screen
    ;; Animate the heading (like typing works etc)
    [:h1.bg-black-pearl.text-9xl ""]]
   [:img.w-screen.h-screen.object-cover {:src "img/hero.webp"}]])
