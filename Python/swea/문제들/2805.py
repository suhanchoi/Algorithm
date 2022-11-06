t = int(input())
for t in range(t):
    n = int(input())
    arr = [list(map(int, input())) for _ in range(n)]
    sum = 0
    mid = n//2
    start = end = mid

    for i in range(n):
        for j in range(start, end+1):
            sum += arr[i][j]
        if i < mid:
            start -= 1
            end += 1
        else:
            start +=1
            end -= 1
    print(f'#{t+1} {sum}')



