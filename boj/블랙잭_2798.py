# 브루트포스, 조합

# n개 중 r개 고르는 조합.  s: 선택구간의 시작, k: 고른 개수
# def nCr(n, r, s, k): # 재귀
#     if k == r:
#         print()
#     else:
#         for i in range(s, n-r+k+1):
#             comb[k] = i
#             nCr(n, r, i + 1, k + 1)

# N = 10
# R = 3
# comb = [0]*R
# nCr(N, R, 0, 0)

num, target = map(int, input().split())

ary = list(map(int,input().split()))
ary.sort() # return 값 X
sum = 0

# for i in range(num-2):
#     temp = ary[i] + ary[i+1] + ary[i+2] # X -> 연속 된것만 찾음
#     if temp > sum and target >= temp:
#         sum = temp
#     if temp > target:
#         print(sum)
#         break

for i in range(num - 2):
    for j in range(i + 1, num - 1):
        for k in range(j + 1, num):
            temp = ary[i] + ary[j] + ary[k]
            if temp > sum and target >= temp:
                sum = temp
print(sum)

