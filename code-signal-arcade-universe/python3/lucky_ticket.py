def is_lucky(n):
    """
    Number -> Boolean, given a number with even number of digits, returns
    true if sum of first half of digits is equal to sum of second half
    """
    lst = [int(x) for x in list(str(n))]
    half = len(lst)//2
    fh = lst[:half]
    sh = lst[half:]
    return sum(fh) == sum(sh)
