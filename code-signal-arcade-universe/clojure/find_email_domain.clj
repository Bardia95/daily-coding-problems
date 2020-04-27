(defn findEmailDomain [a] (str (apply str (reverse (rest (first (split-with (partial not= \@) (reverse a)))))) (last a)))
