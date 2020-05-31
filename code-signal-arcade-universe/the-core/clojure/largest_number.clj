(defn largest-number [n]
  (dec (reduce * (repeat n 10))))

(comment "Given an integer n, return the largest number that contains exactly n digits.

         Example

         For n = 2, the output should be
         largestNumber(n) = 99.

         Input/Output

         [execution time limit] 16 seconds (clj)

         [input] integer n

         Guaranteed constraints:
         1 ≤ n ≤ 9.

         [output] integer

         The largest integer of length n.")
