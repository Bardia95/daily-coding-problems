# Original solution

def rotate_image(l):
    """
    List->List, rotates a 2D matrix of any size 90 degrees clockwise
    """
    l.reverse()
    for i in range(len(l)):
        for j in range(i):
            l[i][j], l[j][i] = l[j][i], l[i][j]
    return l

# More elegant solution

def rotate_matrix(m):
    """
    List->List, rotates a 2D matrix of any size 90 degrees clockwise
    """
    return list(zip(*m[::-1]))
