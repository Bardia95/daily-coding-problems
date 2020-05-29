(defn alphabetic-shift [s]
  (apply str (map #(char (+ (mod (- (int %) 96) 26) 97)) s)))


(defn shift [c]
  (-> c
      int
      (- 96)
      (mod 26)
      (+ 97)
      char))

(defn alphabetic-shift-2 [s]
  (apply str (map shift s)))


(comment
  "Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

  Example

  For inputString = \"crazy\", the output should be alphabeticShift(inputString) = \"dsbaz\".

  Input/Output

  [execution time limit] 4 seconds (py3)

  [input] string inputString

  A non-empty string consisting of lowercase English characters.

  Guaranteed constraints:
  1 ≤ inputString.length ≤ 1000.

  [output] string

  The resulting string after replacing each of its characters.")
