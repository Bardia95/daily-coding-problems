(defn almost_increasing_list
  "List -> Boolean, given a list, return true if removing one element results
  in a sorted list"
  [l]
  (loop [i (dec (count l))]
    (and (>= i 0) (or (apply < (keep-indexed #(if (not= i %1) %2) l))
                      (recur (dec i))))))
