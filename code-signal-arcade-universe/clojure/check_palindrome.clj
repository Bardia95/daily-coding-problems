(defn check-palindrome
  "String->Boolean, given a string s, return true if palindrome, else false"
  (= (clojure.string/reverse s) s))
