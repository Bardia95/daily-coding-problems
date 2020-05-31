(defn candies [n m]
  (if (= (mod m n) 0)
    m
    (recur n (dec m))))
