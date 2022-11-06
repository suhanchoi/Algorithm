def per(k, sumv):
    global minv
    if sumv >= minv:  # 합이 기존 minv보다 커지면 중단
        return

    if k == n:  # 끝까지 다 오면 k -> 3
        if minv > sumv:  # minv를 구함
            minv = sumv
    else:
        for i in range(n):
            if not visited[i]:
                visited[i] = True
                per(k + 1, sumv + lst[k][i])
                visited[i] = False


t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    lst = [list(map(int, input().split())) for _ in range(n)]
    visited = [False] * n
    minv = 10 * n
    per(0, 0)
    print('#{} {}'.format(tc, minv))


########################################################################

def per1(k, sumv):
    global minv

    if minv < sumv:
        return

    if k == n :
        if minv > sumv:
            minv = sumv
    else:
        for i in range(n):
            if not visited[i]:
                visited[i] = True
                per(k+1, sumv + arr[k][i])
                visited[i] = False


def per2(k, sumv):
    global minv

    if sumv > minv:
        return
    if k == n:
        if minv > sumv:
            minv = sumv

    else:
        for i in range(n):
            if not visited[i]:
                visited[i] = True
                per2(k + 1, sumv + arr[k][i])
                visited[i] = False


t = int(input())
for t in range(t):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]
    minv = 10 * n
    visited = [False] * n
    per2(0, 0)
    print(f'#{t} {minv}')


# t = int(input())
# for t in range(t):
#     n = int(input())
#     arr = [list(map(int, input().split())) for _ in range(n)]
#     # print(arr)
#     sum = 0
#
#     for i in range(n):
#         mini = 0
#         mini = min(arr[i])
#         sum += mini
#         midx = arr[i].index(mini)
#         # print(sum)
#         if i != 0:
#             mini = min(arr[i])
#             if midx == (arr[i].index(mini)):
#                 arr[i][midx] = 0
#             mini = min(arr[i])
#             sum += mini
#             # print(sum)
#
#     print(f'#{t+1} {sum}')




