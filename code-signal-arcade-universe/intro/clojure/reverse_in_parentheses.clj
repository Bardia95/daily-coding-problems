(defn reverse-in-parentheses [s]
  (loop [s s
         i 0
         start 0
         reversed ""]
    (if (= i (count s))
      reversed
      (if (= \( ((vec s) i))
        (recur s
               (inc i)
               i
               reversed)
        (if (= \) ((vec s) i))
          (recur s
                 (inc i)
                 start
                 (str
                  (subs s 0 start)
                  (clojure.string/reverse (subs s (+ 1 start) i))
                  (subs s (+ i 1))))
          (recur s
                 (inc i)
                 start
                 reversed))))))


(comment
  "Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
reverseInParentheses(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
Input/Output

[execution time limit] 16 seconds (clj)

[input] string inputString

A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in inputString form a regular bracket sequence.

Guaranteed constraints:
0 ≤ inputString.length ≤ 50.

[output] string

Return inputString, with all the characters that were in parentheses reversed.
")
