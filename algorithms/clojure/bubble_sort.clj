(defn bubble
  "Vector Number -> Vector, checks if last item in given vector is bigger than x, if it is, return vector with values swapped, otherwise, return vector with x appended. If given vector is empty, return vector with x"
  [ys x]
  (if-let [y (peek ys)]
    (if (> y x)
      (conj (pop ys) x y)
      (conj ys x))
    [x]))

(defn bubble-sort
  "Vector -> Vector, returns given vector sorted"
  [xs]
  (let [ys (reduce bubble [] xs)]
    (if (= xs ys)
      xs
      (recur ys))))

(assert (= (bubble-sort [3 2 1]) [1 2 3]) "Test 1 failed")
(assert (= (bubble-sort [1 2 3]) [1 2 3]) "Test 2 failed")
(assert (= (bubble-sort [3 3 3]) [3 3 3]) "Test 3 failed")
(assert (= (bubble-sort [1]) [1]) "Test 4 failed")
(assert (= (bubble-sort [-1]) [-1]) "Test 5 failed")
(assert (= (bubble-sort [9 -1 0 -8 5]) [-8 -1 0 5 9]) "Test 6 failed")
(assert (= (bubble-sort []) []) "Test 7 failed")
