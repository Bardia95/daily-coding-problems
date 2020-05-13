(defn different-squares [matrix]
  (count (set (partition 4 (for [i (range (dec (count matrix)))
                                 j (range (dec (count (first matrix))))
                                 k (range 2)
                                 l (range 2)]
                             (get-in matrix [(+ i k) (+ j l)]))))))
