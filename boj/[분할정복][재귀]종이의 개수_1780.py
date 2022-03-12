from sys import stdin

# 분할 정복, 재귀

def dfs(v):
    dfs_visited[v] = True
    st.append(v)
    dfs_result.append(v)

    while st:
        v = st.pop(-1)

        for w in gr[v]: # 양방향 이기 때문에 재귀
            if dfs_visited[w] == False:
                # st.append(w) # 단방향
                # visited[w] = True
                # dfs_result.append(w)
                dfs(w)


def bfs(v):
    bfs_visited[v] = True
    que.append(v)
    bfs_result.append(v)

    while que:
        v = que.popleft()
        gr[v].sort
        for w in gr[v]:
            if bfs_visited[w] == False:
                que.append(w)
                bfs_visited[w] = True
                bfs_result.append(w)

V, E, s = list(map(int, stdin.readline().split()))
# V : 정점 수, E : 간선 수, s 탐색 시작 정점 번호

gr = [[] for _ in range(V + 1)]

dfs_visited = [False] * (V + 1)
st = []
dfs_result = []

bfs_visited = [False] * (V + 1)
que = deque()
bfs_result = []

for i in range(E):
    x, y = list(map(int, stdin.readline().split()))
    gr[x].append(y)
    gr[y].append(x)

for i in range(len(gr)): # 정점 번호 작은 것 부터 먼저 방문
    gr[i].sort()

dfs(s)

for i in dfs_result:
    print(i, end=" ")
print()

bfs(s)

for i in bfs_result:
    print(i, end=" ")