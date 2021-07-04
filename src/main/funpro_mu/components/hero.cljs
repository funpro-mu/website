(ns funpro-mu.components.hero)

(defn hero []
  [:div.relative.mt-16
   [:div.max-w-screen-xl.mx-auto
    [:div.absolute.top-1-2.transform.-translate-y-1-2
      [:span.max-w-screen-xl.mx-auto.bg-black-pearl.bg-opacity-80.leading-snug.text-amber.text-9xl "(hello :world)"]]]
   [:img.w-screen.h-screen.object-cover {:src "img/hero.webp"}]])
