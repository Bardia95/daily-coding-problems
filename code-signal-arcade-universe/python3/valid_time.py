def valid_time(time):
    h,m = map(int, time.split(":"))
    return h < 24 and m < 60
