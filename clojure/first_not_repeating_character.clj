(defn first-not-repeating-character
  "String->String, returns first non-repeating-character of a string, if all repeating, returns \"_\""
  [s]
  (let [ans (str (first ((group-by (frequencies s) s) 1)))] 
    (if (= ans "") "_" ans)))
