(defn binary-search
  "Vector Element -> Integer, Given a vector and an element, return the index of the element in the vector, or nil if not found"
  [v e]
  (loop [lo 0
         hi (dec (count v))]
    (if (> lo hi) nil
        (let [md (quot (+ lo hi) 2)
              mv (v md)]
          (cond
            (> mv e) (recur lo (dec md))
            (< mv e) (recur (inc md) hi)
            (= mv e) md)))))
