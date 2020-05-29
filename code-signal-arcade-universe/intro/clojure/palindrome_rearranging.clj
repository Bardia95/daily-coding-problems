(defn palindrome-rearranging [st]
  (loop [s #{}
         i 0]
    (if (= i (count st))
      (<= (count s) 1)
      (if (contains? s ((vec st) i))
        (recur (disj s ((vec st) i)) (inc i))
        (recur (conj s ((vec st) i)) (inc i))))))


(comment "
Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 16 seconds (clj)

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
")
