(defn merge [l r]
  (loop [res []
         i    0
         j    0]
    (if (and (< i (count l)) (< j (count r)))
      (if (< (l i) (r j))
        (recur (conj res (l i))
               (inc i)
               j)
        (recur (conj res (r j))
               i
               (inc j)))
      (if (< i (count l))
        (recur (conj res (l i))
               (inc i)
               j)
        (if (< j (count r))
          (recur (conj res (r j))
                 i
                 (inc j))
          res)))))

(defn merge-sort [v]
  (if (< (count v) 2)
    v
    (let [mid (quot (count v) 2)
          split (split-at mid v)
          left (merge-sort (first split))
          right (merge-sort (peek split))]
      (merge left right))))
