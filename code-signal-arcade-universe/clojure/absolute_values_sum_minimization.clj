(defn absolute-sum [x v]
  (reduce + (map #(Math/abs (- % x)) v)))

(defn absolute-values-sum-minimization [v]
  (->> v
       (map #(vector % (absolute-sum % v)))
       (sort-by second)
       ffirst))

