from collections import Counter

def common_character_count(s1, s2):
    """
    String String -> Int, returns number characters in common between two strings
    """
    return sum((Counter(s1) & Counter(s2)).values())
