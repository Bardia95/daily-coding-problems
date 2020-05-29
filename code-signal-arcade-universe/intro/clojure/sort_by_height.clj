(defn sort-by-height [a]
  (loop [v (into {} (map-indexed hash-map a))
         i 0
         j 0
         b (into [] (sort (remove #(= % -1) a)))]
    (if (= i (count v))
      (vals v)
      (if (= (v i) -1)
        (recur v (inc i) j b)
        (recur (into (sorted-map) (map #(if (= (key %) i) {(key %) (b j)} %) v))
               (inc i)
               (inc j)
               b)))))

(comment
  "Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[execution time limit] 16 seconds (clj)

[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

Guaranteed constraints:
1 ≤ a.length ≤ 1000,
-1 ≤ a[i] ≤ 1000.

[output] array.integer

Sorted array a with all the trees untouched.")
