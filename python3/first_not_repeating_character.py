def first_not_repeating_character(s):
    """
    String -> String
    Produces first non-repeating character in string, if no non-repeating characters return '_'
    """
    order = []
    seen = {}
    for char in s:
        if char in seen:
            seen[char] += 1
        else:
            seen[char] = 1
            order.append(char)
    for char in order:
        if seen[char] == 1:
            return char
    return '_'
