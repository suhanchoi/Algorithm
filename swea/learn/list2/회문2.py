def reversechk(str):
    for i in range(len(str)):
        if str[i] != str[len(str) - 1 - i]:
            break
        if i == len(str) // 2:
            return True
    return False

for t in range(10):
    num = input()
    ary = list(input() for _ in range(100))
    r1 = 0
    r2 = 0
    result = 0

    for i in range(100):
        for j in range(100):
            cnt = 0
            for k in range(100, 0, -1):
                if reversechk(ary[i][j:k]): # 회문 판별
                    cnt = k - j  # 회문의 길이
                    if r1 < cnt:
                        r1 = cnt

    for i in range(100):
        for s in range(99, -1, -1):
            cnt = 0
            for j in range(100 - s - 1):
                temp = ""
                for k in range(j, j + s+1):
                    temp += (ary[k][i])
                    temp = temp.strip()
                if len(temp) > r1 and reversechk(temp):  # and len(temp)> r2
                    cnt = len(temp)
                    if r2 < cnt:
                        r2 = cnt
    if r1 > r2:
        result = r1
    else:
        result = r2


    print(f'#{t + 1} {result}')
