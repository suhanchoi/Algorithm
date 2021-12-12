# 순열 1

# def perm(n,k):
#     if k == n :
#         print(*p)
#         return
#     else:
#         for i in range(k, n):
#             p[k], p[i] = p[i], p[k]
#             perm(n, k+1)
#             p[k], p[i] = p[i], p[k]
#
# p = [1, 2, 3]
# perm(3, 0)


def perm2(n, m, k): # n 순열의 길이, k 결정하는 위치
    if n == k:
        print(*p)
    else:
        for i in range(m): # m 주어진 개수만큼 반복
            if used[i] == 0:
                used[i] = 1
                p[k] = arr[i]
                perm2(n, m, k+1)
                used[i] = 0

p = [0] * 3 # : * n
arr = [1, 2, 3, 4, 5] # : m
used = [0] * 5 # : m 개수 만큼
perm2(3, 5, 0) # m 개의 개수 크기에서 n 길이만큼 순열 뽑기