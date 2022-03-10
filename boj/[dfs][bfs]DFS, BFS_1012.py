from sys import stdin
import sys
sys.setrecursionlimit(10000) # recursive 해제

# 그래프 상하좌우 , dfs, bfs,

def dfs(x, y):
    visited[x][y] = True

    for i in range(4):
        tx = x + dx[i]
        ty = y + dy[i]
        if -1 < tx < N and -1 < ty < M:  # 좌표 안인지 확인
            if gr[tx][ty] == 1 and visited[tx][ty] == False:
                dfs(tx, ty)


# 상 하 좌 우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

t = int(stdin.readline())

for t in range(t):  # M 가로 길이, N 세로길이 K 배추 개수
    M, N, k = list(map(int, stdin.readline().split()))

    gr = [[0] * M for _ in range(N)]
    visited = [[False] * M for _ in range(N)]

    for k in range(k):
        x, y = list(map(int, stdin.readline().split()))
        gr[y][x] = 1  # y 가 세로 행, x 가 가로 열

    result = 0

    for i in range(N):  # 행 : N
        for j in range(M):  # 열 : M
            if gr[i][j] == 1 and visited[i][j] == False:
                dfs(i, j)
                result += 1

    print(result)