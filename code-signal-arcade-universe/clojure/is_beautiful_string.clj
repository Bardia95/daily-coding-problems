(defn is-beautiful-string [s]
  (let [az (into {}
                 (for [z (apply str (map char (range 97 123)))]
                   [z 0]))]
    (->> (frequencies s)
         (merge-with + alpha)
         vals
         (apply >=))))
