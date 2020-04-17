(defn deposit-profit [d r t]
  (loop [y 0
         d d]
    (if (>= d t)
      y
      (recur (inc y) (+ d (* d (/ r 100)))))))
