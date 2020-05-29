(defn variable-name [name]
  (if (or (Character/isLetter (first name)) (= \_ (first name)))
    (->> (rest name)
         (map #(or (Character/isLetter %) (Character/isDigit %) (= % \_)))
         (every? true?))
    false))


(defn variable-name-2 [name]
  (not (nil? (re-matches #"[a-zA-Z_]\w+" name))))
