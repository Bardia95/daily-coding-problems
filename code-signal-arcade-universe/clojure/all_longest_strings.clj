(defn all-longest-strings
  "List->List, given a list of strings, return all strings that have the longest length"
  [strings]
  (remove #(< (count %) (count (last (sort-by count strings)))) strings))
