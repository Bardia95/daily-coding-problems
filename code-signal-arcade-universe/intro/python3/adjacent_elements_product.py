# Original solution

def adjacent_elements_product(l):
    """
    List->Integer, given a list, return the largest product of consecutive pairs
    """
    res = float('-inf')
    for i in range(0, len(l) - 1):
        if (l[i] * l[i + 1] > res):
            res = l[i] * l[i + 1]
    return res

# More elegant solution

def max_product_pair(l):
    """
    List->Integer, given a list, return the largest product of consecutive pairs
    """
    return max([l[i] * l[i+1] for i in range(0, len(l)-1)])
