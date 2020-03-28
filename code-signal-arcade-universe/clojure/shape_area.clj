(defn shape_area
  "Integer->Integer"
  [n]
  (if (= n 1)
    1
    (+ (* n n) (* (- n 1) (- n 1)))))
