(defn makeArrayConsecutive2 [v]
  (- (- (apply max statues) (apply min statues)) (- (count statues) 1)))
