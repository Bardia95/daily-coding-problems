(defn adjacent-elements-product
  "Vector->Integer, returns the largest product of consecutive pairs in a vector"
  [v]
  (apply max (for [i (range (- (count v) 1))]
               (* (v i) (v (+ i 1))))))
