(defn spiral-numbers [n]
  (let [cyc (cycle [1 n -1 (- n)])]
    (->> (range (dec n) 0 -1)
         (mapcat #(repeat 2 %))
         (cons n)
         (mapcat #(repeat %2 %) cyc)
         (reductions +)
         (map vector (range 1 (inc (* n n))))
         (sort-by second)
         (map first)
         (partition n))))

(comment "
Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]
Input/Output

[execution time limit] 4 seconds (py3)

[input] integer n

Matrix size, a positive integer.

Guaranteed constraints:
3 ≤ n ≤ 100.

[output] array.array.integer

")
