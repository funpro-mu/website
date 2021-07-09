(ns funpro-mu.components.page)


(def ^:private snap-classes "scroll-margin-top snap-start")


(defn page
  [{:keys [id
           padding?
           direction
           image
           image-alt-text
           heading]} children]
  [:section {:id id
             :class (str snap-classes
                         " lg:flex w-full flex "
                         (when padding? "pb-5 px-8 ")
                         (cond
                           (= direction :right) "flex-row-reverse"
                           (= direction :left) "flex-row"
                           :else ""))}
   (and image
        [:div.relative.pb-2-3
         [:img {:src image :alt image-alt-text}]])
   [:div.mx-auto
    (and heading
         [:h2.text-4xl.leading-loose heading])
    children]])
