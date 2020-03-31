(defn almost_increasing_list
  "List -> Boolean, given a list, return true if removing one element results
    in a sorted list"
  [[x y z & rst :as v]]
  (cond
    (nil? z) (apply <= (conj rst y x))
    (or (<= z y)
        (<= z x)) (or (apply < (conj rst z x))
                      (apply < (conj rst y x))
                      (apply < (conj rst z y)))
    :default (recur (rest v))))
