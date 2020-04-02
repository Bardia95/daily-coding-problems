(defn common-character-count
  "String String -> Int, returns number characters in common between two strings"
  [s1 s2]
  (let [f1 (frequencies s1)
        f2 (frequencies s2)
        mp (merge-with #(min %1 %2) f1 f2)
        ks (distinct (filter (into #{} s1) s2))
        vs (vals (select-keys mp ks))
        rs (reduce + vs)]
    rs))
