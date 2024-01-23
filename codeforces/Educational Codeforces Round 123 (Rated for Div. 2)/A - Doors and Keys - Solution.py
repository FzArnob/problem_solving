for _ in range(int(input())):
    keys = []
    r = 'YES'
    for i in str(input()):
        if i == 'r' or i == 'g' or i == 'b':
            keys.append(i)
        if i == 'R' or i == 'G' or i == 'B':
            if i.lower() not in keys:
                r = 'NO'
    print(r)