(defn file-naming [names]
  (reduce ensure-unique-file-name [] names))



(defn ensure-unique-file-name
  "Helper function to pass to reduce to ensure unique file name"
  [a i]
  (if ((set a) i)
    (conj a (first (remove (set a) (map #(str i "(" % ")") (drop 1 (range))))))
    (conj a i)))

(comment "
You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

Return an array of names that will be given to the files.

Example

For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

Input/Output

[execution time limit] 16 seconds (clj)

[input] array.string names

Guaranteed constraints:
5 ≤ names.length ≤ 1000,
1 ≤ names[i].length ≤ 15.

[output] array.string")
