;; Original solution
(defn matrix-elements-sum [m]
  "List -> Int, given a rectangular matrix on numbers, return sum of all numbers that do not have a 0 above them in their column"
  (reduce + (for [x (apply map vector m)]
              (loop [i 0
                     sum 0]
                (if (or (= i (count x)) (= 0 (x i)))
                  sum
                  (recur (inc i) (+ sum (x i))))))))

;; More elegant solution
(defn matrix-sum [m]
  "List -> Int, given a rectangular matrix on numbers, return sum of all numbers that do not have a 0 above them in their column"
  (reduce #(+ %1 (apply + (take-while (complement zero?) %2))) 0 (apply map vector m)))
