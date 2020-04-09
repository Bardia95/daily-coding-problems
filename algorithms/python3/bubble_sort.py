def bubble_sort(L):
    """
    Sorts list by mutation, no return value
    """
    n = len(L)
    for i in range(n):
        for j in range(1, n-i):
            if L[j-1] > L[j]:
                L[j-1], L[j] = L[j], L[j-1]
