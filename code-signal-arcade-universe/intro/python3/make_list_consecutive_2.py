def make_list_consecutive_2(l):
    """
    List->Integer, Takes array with integers between 0-20, returns number of items required to make 
    """
    return max(l) - min(1) - len(l) + 1
