from sys import stdin

# 땅을 파고 그 블록을 인벤토리에 넣는 시간 2초
# 땅에 인벤토리에 있는 블록 한개 올리는 시간 1초

N, M, B = map(int, stdin.readline().split())  # B : 인벤토리에 있는 블록 수

ary = [list(map(int, stdin.readline().split())) for _ in range(N)]

# result 땅을 고르는데 걸리는 최소 시간, 고르고 난 후의 땅의 높이 출력
m = min(min(ary))
end = max(max(ary))
time = 1000000000
height = 0

lst = []
for i in range(N):
    for j in range(M):
        lst.append(ary[i][j])
lst.sort(reverse=True)

while m <= end:
    temp = 0
    Btemp = B

    for i in range(N * M):
        if lst[i] > m: # 블록제거
            temp += 2 * (lst[i] - m) # 2초
            Btemp += lst[i] - m
        elif lst[i] < m: # 블록 쌓기 1초
            if Btemp >= m - lst[i]: # 필요한 개수가 인벤토리에 있다면
                temp += (m - lst[i])
                Btemp -= m - lst[i] # 사용 후 인벤토리에서 제거
            else:
                temp = 1000000000
                break

    if temp <= time: # 시간이 같다면 높은 땅의 높이 출력
        time = temp
        height = m

    m += 1

print(time, height)
