def binary_search(L, e):
    """
    List Element -> Integer
    Given a list and an element,
    return the index of the element in the list, or nil if not found
    """
    def helper(lo, hi):
        if lo > hi:
            return False
        mid = (lo + hi) // 2
        if L[mid] == e:
            return mid
        elif L[mid] > e:
            return helper(lo, mid-1)
        else:
            return helper(mid+1, hi)
    return helper(0, len(L)-1)
