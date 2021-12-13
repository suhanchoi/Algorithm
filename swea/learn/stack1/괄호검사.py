t = int(input())

for t in range(t):
    str = input()
    chk = []
    b = '['
    m = '{'
    s = '('
    rb = ']'
    rm = '}'
    rs = ')'
    result = 0

    print(f'#{t+1}', end=' ')

    for i in range(len(str)):
        last = 0
        if str[i] == b:
            chk.append(b)
        elif str[i] == m:
            chk.append(m)
        elif str[i] == s:
            chk.append(s)

        try:
            if str[i] == rb:
                if chk[-1] != b:
                    print(0)
                    break
                chk.pop()

            elif str[i] == rm:
                if chk[-1] != m:
                    print(0)
                    break
                chk.pop()

            elif str[i] == rs:
                if chk[-1] != s:
                    print(0)
                    break
                chk.pop()

        except Exception:
            print(0)
        try:
            if i == len(str) - 1:
                if chk == []:
                    print(1)
                    break
                else:
                    print(0)
        except Exception:
            print(0)
