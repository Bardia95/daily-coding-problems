def first_duplicate(a):
    """
    List of Numbers -> Number
    Returns first duplicate in a list of numbers, if no duplicate is found, returns -1
    """
    seen = {}
    for x in a:
        if x in seen:
            return x
        else:
            seen[x] = True
    return -1
