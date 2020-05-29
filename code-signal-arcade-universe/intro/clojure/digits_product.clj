(defn digits-product [p]
  (loop [i 1]
    (if (= i 10000)
      -1
      (if (= p (reduce * (map #(Integer. %) (clojure.string/split (str i) #""))))
        i
        (recur (inc i))))))


(comment "Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
digitsProduct(product) = 26;
For product = 19, the output should be
digitsProduct(product) = -1.
Input/Output

[execution time limit] 16 seconds (clj)

[input] integer product

Guaranteed constraints:
0 ≤ product ≤ 600.

[output] integer

")
