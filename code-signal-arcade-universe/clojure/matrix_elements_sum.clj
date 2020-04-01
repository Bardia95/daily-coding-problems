(defn matrix_elements_sum [m]
  "List -> Int, given a rectangular matrix on numbers, return sum of all numbers that do not have a 0 above them in their column"
  (reduce + (for [x (apply map vector m)]
              (loop [i 0
                     sum 0]
                (if (or (= i (count x)) (= 0 (x i)))
                  sum
                  (recur (inc i) (+ sum (x i))))))))
