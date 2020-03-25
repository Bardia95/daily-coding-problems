(defn lazy-contains?
  "Collection Key -> Boolean, checks a lazy sequence if it contains a specific element"
  [coll key]
  (boolean (some #(= % key) coll)))

(defn first_duplicate
  "Vector -> Integer, returns first duplicate in vector of numbers, if no duplicates, returns -1"
  [a]
  (if (= (distinct a) a)
    -1
    (loop [n (first a)
           coll (rest a)]
      (if (lazy-contains? coll n)
        n
        (recur (first coll) (rest coll))))))
