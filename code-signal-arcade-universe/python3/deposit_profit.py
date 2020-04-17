def deposit_profit(d, r, t):
    y = 0
    while d < t:
        d = d + d * r / 100
        y += 1
    return y
