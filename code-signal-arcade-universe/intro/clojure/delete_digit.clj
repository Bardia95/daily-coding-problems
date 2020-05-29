(defn delete-digit [n]
  (apply max
         (map #(Integer. %)
              (for [i (range (count (str n)))]
                (clojure.string/replace-first (str n) (str (.charAt (str n) i)) "")))))


(comment "Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.
Input/Output

[execution time limit] 16 seconds (clj)

[input] integer n

Guaranteed constraints:
10 ≤ n ≤ 106.

[output] integer

")
