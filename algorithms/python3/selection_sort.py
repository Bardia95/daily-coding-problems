def selection_sort(L):
    """
    Mutates a list, sorting it
    """
    for i in range(len(L)):
        for j in range(i, len(L)):
            if L[j] < L[i]:
                L[i], L[j] = L[j], L[i]
