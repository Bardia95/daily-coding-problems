(defn find-email-domain [a]
  (last (clojure.string/split a #"@")))
