(ns day1.core
  (:require [clojure.string :as str])
  (:gen-class))

(def input (slurp "/Users/bardiapourvakil/programming/daily-coding-problems/advent-of-code/day1/input.txt"))

(defn calculate-fuel [mass]
  (- (quot mass 3) 2))

(defn fuel-requirements [modules]
  (->> (str/split modules #"\n")
       (map #(calculate-fuel (Integer/parseInt %)))
       (apply +)))

(fuel-requirements input)


(defn calculate-fuel-iterative [mass]
  (take-while pos? (iterate calculate-fuel mass)))
;; => #'day1.core/calculate-fuel-iterative

(defn part-two [modules]
  (->> (str/split modules #"\n")
       (mapcat (comp calculate-fuel-iterative calculate-fuel #(Integer/parseInt %)))
       (apply +)))
;; => #'day1.core/part-two


(part-two input)
;; => 4998565

(comment "The Elves quickly load you into a spacecraft and prepare to launch.

         At the first Go / No Go poll, every Elf is Go until the Fuel Counter-Upper. They haven't determined the amount of fuel required yet.

         Fuel required to launch a given module is based on its mass. Specifically, to find the fuel required for a module, take its mass, divide by three, round down, and subtract 2.

         For example:

         For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
         For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
         For a mass of 1969, the fuel required is 654.
         For a mass of 100756, the fuel required is 33583.
         The Fuel Counter-Upper needs to know the total fuel requirement. To find it, individually calculate the fuel needed for the mass of each module (your puzzle input), then add together all the fuel values.

         What is the sum of the fuel requirements for all of the modules on your spacecraft?")
