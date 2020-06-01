(defn seats-in-theater
  [nCols nRows col row]
  (* (- nRows row) (inc (- nCols col))))
