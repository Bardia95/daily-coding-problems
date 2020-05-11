(defn chess-knight [s]
  (let [c1 (Math/min (- (int (.charAt s 0)) (int \a))
                     (- (int \h) (int (.charAt s 0))))
        c2 (Math/min (- (int (.charAt s 1)) (int \1))
                     (- (int \8) (int (.charAt s 1))))
        d1 (Math/min c1 2)
        d2 (Math/min c2 2)]
    (nth [2 3 4 6 8] (+ d1 d2))))


(comment "Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.



Example

For cell = "a1", the output should be
chessKnight(cell) = 2.



For cell = "c2", the output should be
chessKnight(cell) = 6.



Input/Output

[execution time limit] 16 seconds (clj)

[input] string cell

String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.

Guaranteed constraints:
cell.length = 2,
'a' ≤ cell[0] ≤ 'h',
1 ≤ cell[1] ≤ 8.

[output] integer

")
