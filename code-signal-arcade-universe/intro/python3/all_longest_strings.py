def all_longest_strings(strings):
    """
    "List->List, given a list of strings, return all strings that have the longest length
    """
    return [s for s in strings if len(s) == len(max(strings, key=len))]
