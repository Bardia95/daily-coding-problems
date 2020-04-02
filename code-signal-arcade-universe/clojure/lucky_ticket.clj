(defn is-lucky
  "Number -> Boolean, given a number with even number of digits, returns true if sum of first half of digits is equal to sum of second half"
  [n]
  (let [lon (map #(Integer/parseInt %) (clojure.string/split (str n) #""))
        spl (split-at (/ (count lon) 2) lon)
        sms (map #(reduce + %) spl)]
    (apply = sms)))
