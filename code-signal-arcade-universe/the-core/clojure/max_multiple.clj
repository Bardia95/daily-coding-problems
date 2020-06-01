(defn max-multiple
  [d b]
  (if (= (mod b d) 0)
    b
    (recur d (dec b))))
