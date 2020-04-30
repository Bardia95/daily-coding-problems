def build_palindrome(st):
    s = st
    for i in range(len(st)):
        if s == s[::-1]:
            return s
        else:
            s = st + st[i::-1]


"""
Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".

Input/Output

[execution time limit] 4 seconds (py3)

[input] string st

A string consisting of lowercase English letters.

Guaranteed constraints:
3 ≤ st.length ≤ 10.

[output] string
"""
