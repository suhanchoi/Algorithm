# solved
t = int(input())

for k in range(t):
    result = 0

    n = int(input())
    ary = [list([0] * 10) for _ in range(10)]  # 100개 생성

    for num in range(n):
        row1, col1, row2, col2, c = map(int,input().split())
        for row in range(row1, row2 + 1):
            for col in range(col1, col2 + 1):

                if ary[row][col] == 0:
                    ary[row][col] = c

                else:
                    ary[row][col] = 3

    for i in range(10):
        for j in range(10):
            if ary[i][j] == 3: # purple
                result = result + 1

    print(f'#{k+1} {result}')