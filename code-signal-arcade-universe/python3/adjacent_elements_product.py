def adjacent_elements_product(l):
    res = float('-inf')
    for i in range(0, len(l) - 1):
        if (l[i] * l[i + 1] > res):
            res = l[i] * l[i + 1]
    return res
