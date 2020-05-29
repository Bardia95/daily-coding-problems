def delete_digit(n):
    return max([int(str(n)[0:i:] + str(n)[i+1::]) for i in range(len(str(n)))])


"""
Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.
Input/Output

[execution time limit] 16 seconds (clj)

[input] integer n

Guaranteed constraints:
10 ≤ n ≤ 106.

[output] integer

"""
