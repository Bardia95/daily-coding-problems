def shape_area(n):
    """
    Integer->Integer
    """
    assert n < 10**4
    assert n > 0

    if n == 1:
        return 1
    else:
        return (n**2 + (n-1)**2)
