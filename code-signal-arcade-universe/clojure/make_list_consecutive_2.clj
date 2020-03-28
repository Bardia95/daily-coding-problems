(defn make-list-consecutive-2
  "List->Integer, Takes array with integers between 0-20, returns number of items required to make "
  [l]
  (- (- (apply max l) (apply min l)) (- (count l) 1)))
