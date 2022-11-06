# 동철이의 일 분배

# 강의 모범 답

################################ ver.1
# import sys
# sys.stdin = open("input.txt", "r")
#
#
# def solve(k):
#     global ans
#     if k == N :
#         val = 1
#         for i in range(N):
#             val *= mat[i][perm[i]]
#         if val > ans:
#             ans = val
#     else:
#         for i in range(k, N):
#             perm[k], perm[i] = perm[i], perm[k]
#             solve(k + 1)
#             perm[k], perm[i] = perm[i], perm[k]
#
#
# TC = int(input())
# for tc in range(1, TC + 1):
#     N = int(input())
#
#     mat = [0.0] * N
#     for i in range(N):
#         mat[i] = list(map(lambda x: int(x)/100, input().split()))
#
#     ans = 0
#     perm = [x for x in range(N)]
#     solve(0)
#     print("#%d %.6f" % (tc, ans * 100))


#
# ################################ ver.2
# import sys
# import time
# sys.stdin = open("input.txt", "r")
#
# st = time.time()
#
# def solve(k):
#     global ans
#     global cnt
#     cnt += 1
#     if k == N :
#         val = 1
#         for i in range(N):
#             val *= mat[i][perm[i]]
#         if val > ans:
#             ans = val
#     else:
#         for i in range(k, N):
#             perm[k], perm[i] = perm[i], perm[k]
#             val = 1
#             for j in range(k + 1):
#                 val *= mat[j][perm[j]]
#             if val > ans:
#                 solve(k + 1)
#             perm[k], perm[i] = perm[i], perm[k]
#
#
#
# for tc in range(1, int(input()) + 1):
#     N = int(input())
#
#     mat = [0.0] * N
#     for i in range(N):
#         mat[i] = list(map(lambda x: int(x) / 100, input().split()))
#
#     cnt = 0
#     ans = 0
#     perm = [x for x in range(N)]
#     solve(0)
#     #print("#%d %.6f" % (tc, ans * 100))
#
#     print("#%d %.6f" % (tc, ans * 100), cnt)
#
# print(time.time() - st)


#
# # ################################ ver.3
# import sys
# import time
# sys.stdin = open("input.txt", "r")
#
# st = time.time()
#
# def grid_ans():
#     global ans
#     val = 1
#     chk = [0] * N
#     for j in range(N):
#         tmaxi = 0
#         for i in range(N):
#             if not chk[i] and tmaxi < mat[i][j]:
#                 tmaxi = i
#         chk[tmaxi] = 1
#         val *= mat[tmaxi][j]
#  
#     ans = val
#
#
# def solve( k, val ):
#     global ans
#     global cnt
#     cnt += 1
#     if k == N :
#         if val > ans:
#             ans = val
#     else:
#         for i in range(k, N):
#             perm[k], perm[i] = perm[i], perm[k]
#             if val * mat[k][perm[k]] > ans:
#                 solve(k + 1, val * mat[k][perm[k]])
#             perm[k], perm[i] = perm[i], perm[k]
#
#
# for tc in range(1, int(input()) + 1):
#     N = int(input())
#
#     mat = [0.0] * N
#     for i in range(N):
#         mat[i] = list(map(lambda x: int(x)/100, input().split()))
#
#     cnt = 0
#     ans = 0
#     perm = [x for x in range(N)]
#
#     grid_ans()
#
#     solve(0, 1)
#     #print("#%d %.6f" % (tc, ans * 100))
#     print("#%d %.6f" % (tc, ans * 100), cnt)
#
# print(time.time() - st)


#
# # ################################ ver.4
# import sys
# import time
# sys.stdin = open("input.txt", "r")
#
# st = time.time()

def solve(k, val):
    if val == (1 << N) - 1: return 1
    if DP[val]: return DP[val]

    for i in range(N):
        if mat[k][i] and not (val & (1 << i)):
            DP[val] = max(DP[val], mat[k][i] * solve(k + 1, val | (1 << i)))

    return DP[val]


for tc in range(1, 1 + int(input())):
    N = int(input())
    mat = [list(map(lambda x: x / 100, map(int, input().split()))) for _ in range(N)]

    DP = [0] * (1 << N)
    print("#%d %.6f" % (tc, solve(0, 0) * 100))

# print(time.time() - st)