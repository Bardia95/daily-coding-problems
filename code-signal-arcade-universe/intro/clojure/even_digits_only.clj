(require '[clojure.string :as str])

(defn even-digits-only [n]
  (->> (str/split (str n) #"")
       (map #(Integer/parseInt %))
       (every? even?))
