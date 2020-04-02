(defn common-character-count
  "String String -> Int, returns number characters in common between two strings"
  [s1 s2]
  (reduce + (vals (select-keys (merge-with #(min %1 %2) (frequencies s1) (frequencies s2)) (distinct (filter (into  #{} s1) s2))))))
