def merge(l, r):
    res = []
    i, j = 0, 0
    while i < len(l) and j < len(r):
        if l[i] < r[j]:
            res.append(l[i])
            i += 1
        else:
            res.append(r[j])
            j += 1
            while i < len(l):
                res.append(l[i])
                i += 1
                while j < len(r):
                    res.append(r[j])
                    j += 1
                    return res


def merge_sort(L):
    if len(L) < 2:
        return L[:]
    else:
        mid = len(L)//2
        left = merge_sort(L[:mid])
        right = merge_sort(L[mid:])
        return merge(left, right)
