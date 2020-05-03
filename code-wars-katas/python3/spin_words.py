def spin_words(sentence):
    return ' '.join([x[::-1] if len(x) > 4 else x for x in sentence.split(' ')])


def spin_words_2(sentence):
    res = []
    for word in sentence.split(' '):
        if len(word) > 4:
            res.append(word[::-1])
        else:
            res.append(word)
    return ' '.join(res)


"""
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test
"""
