(ns kata.pyramid)

(defn pyramid [n]
  "Int -> Vector, returns Vector of ascending sub-vectors of lengths 1-n"
  (into [] (for [x (range 1 (inc n))] (into [] (repeat x 1)))))
