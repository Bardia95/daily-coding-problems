(defn array-change [a]
  (if (< (count a) 2)
    0
    (loop [prev (first a)
           curr (second a)
           rx (rest (rest a))
           cnt 0]
      (let [nc (if (> curr prev) 0 (inc (- prev curr)))
            nprev (+ curr nc)]
        (if (empty? rx) (+ cnt nc)
            (recur nprev
                   (first rx)
                   (rest rx)
                   (+ cnt nc)))))))


(comment "You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example

For inputArray = [1, 1, 1], the output should be
arrayChange(inputArray) = 3.

Input/Output

[execution time limit] 16 seconds (clj)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
-105 ≤ inputArray[i] ≤ 105.

[output] integer

The minimal number of moves needed to obtain a strictly increasing sequence from inputArray.
It's guaranteed that for the given test cases the answer always fits signed 32-bit integer type.")
