# 재귀, 메모이제이션으로 풀이
def cal(k, n):
    global ary
    if k == 0:
        if ary[k][n] == 0:
            ary[k][n] = n
        return ary[k][n]
    sum = 0
    for i in range(n):
        if ary[k-1][i] == 0:
            sum += cal(k-1, i)
        else:
            sum += ary[k-1][i]
    ary[k][n] = sum
    return ary[k][n]

t = int(input())
for t in range(t):
    k = int(input()) # 층
    n = int(input()) # 호수
    ary = [[0] * (n+1) for _ in range(k+1)] # 빈 2차원 배열 생성
    print(cal(k, n))

