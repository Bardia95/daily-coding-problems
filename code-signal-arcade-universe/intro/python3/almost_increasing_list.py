def almost_increasing_list(l):
    """
    List -> Boolean, given a list, return true if removing one element results
    in a sorted list
    """
    for i in range(len(l)):
        c = l[:i] + l[i+1:]
        if c == sorted(c) and len(c) == len(set(c)):
            return True
    return False
