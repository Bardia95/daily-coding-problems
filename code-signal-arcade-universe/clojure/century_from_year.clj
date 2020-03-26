(defn f2d
  "Int->Int, Given a number 2+ digits long, return first two digits"
  [n]
  (Integer/parseInt (str (first (str n)) (second (str n)))))

(defn century-from-year
  "Int->Int, Given a year, return the century it is in"
  [y]
  (if (= (mod y (f2d y)) 0)
    (f2d y)
    (+ 1 (f2d y))))

