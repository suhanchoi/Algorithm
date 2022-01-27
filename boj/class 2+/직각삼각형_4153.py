while(True):
    ary = list(map(int, input().split()))

    c = max(ary)
    if c == 0:
        break
    ary.remove(c)

    a = ary[0]
    b = ary[1]

    if c**2 == a**2 + b**2:
        print('right')
    else:
        print('wrong')
