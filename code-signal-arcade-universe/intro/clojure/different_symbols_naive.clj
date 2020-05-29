(defn different-symbols-naive [s]
  (count (distinct s)))

(comment "
Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.

Input/Output

[execution time limit] 16 seconds (clj)

[input] string s

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ s.length ≤ 1000.

[output] integer")
