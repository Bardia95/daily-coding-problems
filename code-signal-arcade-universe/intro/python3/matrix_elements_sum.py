def matrix_elements_sum(m):
    """
    List -> Int, given a rectangular matrix on numbers, return sum of all numbers that do not have a 0 above them in their column
    """
    res = 0
    for i in range(len(m)):
        for j in range(len(m[i])):
            if i == 0:
                res += m[i][j]
            elif m[i-1][j] == 0:
                m[i][j] = 0
            else:
                res += m[i][j]
    return res
