(defn f2d
  "Int->Int, Given a number 2+ digits long, return first two digits"
  [n]
  (Integer/parseInt (str (first (str n)) (second (str n)))))
;; => #'user/f2d

(defn l2d
  "Int->Int, Given a number 2+ digits long, return last two digits"
  [n]
  (Integer/parseInt (str (second (clojure.string/reverse (str n))) (first (clojure.string/reverse (str n))))))
;; => #'user/l2d

(def d1 (comp #(. Integer parseInt %) str first str))
;; => #'user/d1


(defn century-from-year
  "Int->Int, Given a year, return the century it is in"
  [y]
  (if (<= y 100)
    1
    (if (< y 1000)
      (if (= (l2d y) 0)
        (d1 y)
        (+ 1 (d1 y)))
      (if (= (l2d y) 0)
        (f2d y)
        (+ 1 (f2d y))))));; => #'user/century-from-year
