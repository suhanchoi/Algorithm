# # 재귀, 메모이제이션으로 풀이
# def cal(k, n):
#     if k == 0:
#         return n
#     sum = 0
#     for i in range(n):
#         sum += cal(k-1, i+1)
#     return sum
#
# t = int(input())
# for t in range(t):
#     k = int(input()) # 층
#     n = int(input()) # 호수
#     ary = [[0] * n for _ in range(k)] # 빈 2차원 배열 생성
#     print(cal(k, n))

def cal(k, n): # 재귀
    global ary
    if k == 0:
        if ary[k][n] == 0:
            ary[k][n] = n
        return ary[k][n]
    sum = 0
    for i in range(1,n+1):
        if ary[k][i] == 0:
            sum += cal(k-1, i)
        else:
            sum += ary[k-1][i]
    ary[k][n] = sum
    return ary[k][n]

t = int(input())
for t in range(t):
    k = int(input()) # 층
    n = int(input()) # 호수
    ary = [[0] * (n+1) for _ in range(k)]
    print(cal(k, n))

