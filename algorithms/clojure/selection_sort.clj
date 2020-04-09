(defn excl
  "Vector Number -> Vector, given a vector and a number, return the vector without the number"
  [v x]
  (let [[a b] (split-with #(not= % x) v)]
    (concat a (rest b))))

(defn selection-sort
  "Vector -> Vector, sort vector by selection sort"
  [v]
  (loop [a []
         b v]
    (if (empty? b)
      a
      (let [m (apply min b)]
        (recur (conj a m)
               (excl b m))))))
