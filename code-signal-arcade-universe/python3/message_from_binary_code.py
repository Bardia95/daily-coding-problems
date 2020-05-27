def message_from_binary_code(code):
    return "".join([chr(int(code[8*i:8*i+8],2)) for i in range(len(code)//8)]
