(defn variable-name [name]
  (if (or (Character/isLetter (first name)) (= \- (first name)))
    (->> (rest name)
         (map #(or (Character/isLetter %) (Character/isDigit %) (= % \-)))
         (every? true?))
    false))
