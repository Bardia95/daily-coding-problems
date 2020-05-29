(defn add-two-digits
  [n]
  (reduce + (map #(Integer. %) (clojure.string/split (str n) #""))))

(comment "
You are given a two-digit integer n. Return the sum of its digits.

Example

For n = 29, the output should be
addTwoDigits(n) = 11.

Input/Output

[execution time limit] 16 seconds (clj)

[input] integer n

A positive two-digit integer.

Guaranteed constraints:
10 ≤ n ≤ 99.

[output] integer

The sum of the first and second digits of the input number.")


