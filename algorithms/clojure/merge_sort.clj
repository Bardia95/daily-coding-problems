(defn merge
  "Vector Vector -> Vector, returns given vectors merged and sorted"
  [l r]
  (loop [v []
         i    0
         j    0]
    (if (and (< i (count l))
             (< j (count r)))
      (if (< (l i) (r j))
        (recur (conj v (l i))
               (inc i)
               j)
        (recur (conj v (r j))
               i
               (inc j)))
      (if (< i (count l))
        (recur (conj v (l i))
               (inc i)
               j)
        (if (< j (count r))
          (recur (conj v (r j))
                 i
                 (inc j))
          v)))))

(defn merge-sort
  "Vector -> Vector, returns a sorted version of the given vector"
  [v]
  (if (< (count v) 2)
    v
    (let [mid   (quot (count v) 2)
          split (split-at mid v)
          left  (vec (merge-sort (first split)))
          right (vec (merge-sort (peek split)))]
      (merge left right))))
