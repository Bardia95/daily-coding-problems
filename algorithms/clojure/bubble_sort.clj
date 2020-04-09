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
