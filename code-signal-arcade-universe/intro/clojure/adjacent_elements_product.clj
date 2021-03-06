;; Original Solution
(defn adjacent-elements-product
  "Vector->Integer, returns the largest product of consecutive pairs in a vector"
  [v]
  (apply max (for [i (range (- (count v) 1))]
               (* (v i) (v (+ i 1))))))

;; Alternative solution

(defn adjacent-elements-product
  "Vector->Integer, returns the largest product of consecutive pairs in a vector"
  [v]
  (apply max (map #(apply * %) (partition 2 1 v))))
