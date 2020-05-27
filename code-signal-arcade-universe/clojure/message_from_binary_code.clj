(defn messageFromBinaryCode [code]
  (apply str (map #(char (Integer/parseInt (clojure.string/join %) 2)) (partition 8 code))))
