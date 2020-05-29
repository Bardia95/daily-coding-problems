def chess_board_cell_color(cell1, cell2):
    return (ord(cell1[0]) + int(cell1[1]) + ord(cell2[0]) + int(cell2[1])) % 2 == 0


"""
Given two cells on the standard chess board, determine whether they have the same color or not.

For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.

For cell1 = "A1" and cell2 = "H3", the output should be
chessBoardCellColor(cell1, cell2) = false.

Input/Output

[execution time limit] 4 seconds (py3)

[input] string cell1

Guaranteed constraints:
cell1.length = 2,
'A' ≤ cell1[0] ≤ 'H',
1 ≤ cell1[1] ≤ 8.

[input] string cell2

Guaranteed constraints:
cell2.length = 2,
'A' ≤ cell2[0] ≤ 'H',
1 ≤ cell2[1] ≤ 8.

[output] boolean

true if both cells have the same color, false otherwise.
"""
