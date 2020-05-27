(defn binary->string
  [b]
  (char (Integer/parseInt (clojure.string/join b) 2)))


(defn messageFromBinaryCode
  [code]
  (apply str (map binary->string (partition 8 code))))
