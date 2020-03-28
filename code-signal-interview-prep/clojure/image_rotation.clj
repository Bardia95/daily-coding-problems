(defn rotate-image
  "Vector-> Vector, takes n x n matrix, returns it rotated 90 degrees clockwise"
  [m]
  (map reverse (apply map vector m)))
