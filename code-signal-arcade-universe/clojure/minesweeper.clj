(defn neighbours [matrix [x y]]
  (for [dx [-1 0 1]
        dy [-1 0 1]
        :when (not= 0 dx dy)]
    (get-in matrix [(+ x dx) (+ y dy)])))

(defn no-mine [matrix pos]
  (->> (neighbours matrix pos)
       (filter true?)
       count))

(defn minesweeper [matrix]
  (let [x (count matrix)
        y (count (first matrix))
        z (for [i (range x)
                j (range y)]
            (no-mine matrix [i j]))]
    (partition y z)))


(comment "
(defn neighbours [matrix [x y]]
  (for [dx [-1 0 1]
        dy [-1 0 1]
        :when (not= 0 dx dy)]
    (get-in matrix [(+ x dx) (+ y dy)])))

(defn no-mine [matrix pos]
  (->> (neighbours matrix pos)
       (filter true?)
       count))

(defn minesweeper [matrix]
  (let [x (count matrix)
        y (count (first matrix))
        z (for [i (range x)
                j (range y)]
            (no-mine matrix [i j]))]
    (partition y z)))
")
