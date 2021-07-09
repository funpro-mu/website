(ns funpro-mu.components.hero)


(defn- typewriter-text [text]
  [:span.typewriter.mx-auto.bg-black-pearl.bg-opacity-80.leading-snug.text-amber.text-5xl.md:text-9xl text])


(defn- highlight-clojure-code [function keyword]
  [:div [:span.text-green-400 "("] [:span.text-blue-200 function] " :" keyword [:span.text-green-400 ")"]])


(defn- hero-image []
  [:img.w-screen.h-screen.object-cover {:src "img/hero.webp"}])


(defn hero []
  [:div.mt-16
   [:div.relative
    [:div.max-w-screen-xl.mx-auto.relative
     [:div.absolute.h-screen.-mt-16.transform.left-1-2.-translate-x-1-2.flex.items-center
      [typewriter-text (highlight-clojure-code "hello" :world)]]]
    [hero-image]]])
