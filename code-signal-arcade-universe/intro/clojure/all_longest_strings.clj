(defn all-longest-strings
  "List->List, given a list of strings, return all strings that have the longest length"
  [strings]
  (remove #(< (count %) (count (last (sort-by count strings)))) strings))


(defn all-longest-strings-v2
  "List->List, given a list of strings, return all strings that have the longest length"
  [strings]
  (->> strings
       (group-by count)
       (sort-by key >)
       first
       val))
