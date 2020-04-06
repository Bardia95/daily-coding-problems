(defn add-border [pic]
  (let [border (apply str (repeat (+ 2 (count (first  pic))) "*"))
        pic  (map #(str "*" % "*") pic)]
    (conj (apply vector (conj (apply list pic) border)) border)))


(comment "Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[execution time limit] 16 seconds (clj)

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.")
