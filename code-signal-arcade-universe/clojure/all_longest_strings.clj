(defn all-longest-strings [strings]
  (remove #(< (count %) (count (last (sort-by count strings)))) strings))
