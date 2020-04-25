(defn longest-digits-orefix [s]
  (apply str (re-find #"^[0-9]+" s)))


(comment "
Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
longestDigitsPrefix(inputString) = "123".

Input/Output

[execution time limit] 16 seconds (clj)

[input] string inputString

Guaranteed constraints:
3 ≤ inputString.length ≤ 100.

[output] string")
