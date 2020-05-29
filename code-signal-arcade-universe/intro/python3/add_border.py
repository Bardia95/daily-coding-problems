def add_border(pic):
    border = "*" * (len(pic[0]) + 2)
    pic = ["*" + s + "*" for s in pic]
    pic.insert(0, border)
    pic.append(border)
    return pic



"""
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For
picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[execution time limit] 4 seconds (py3)
[input] array.string picture
A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string
The same matrix of characters, framed with a border of asterisks of width 1.
"""
