#211018
# queue 사용
# bfs1, bfs2
# re 오류


# def bfs(s, V):
#     pass
#
# edge = list(map(int, input().split()))
# adj = [[0]*(V+1) for _ in range(V+1)] # 인접행렬 # 정점 수만큼큼
#
# fr i in range(E): # 노드 수만큼
#     n1, n2 = edge[2 * i], edge[2*i + 1]
#     adj[n1][n2] = 1 # 방향 없는 그래프
#     adj[n2][n1] = 1

def bfs(s, V):
    q = []
    visited = [0] * (V+1)
    q.append(s)
    visited[s] = 1
    while q:
        t = q.pop(0)
        print(t)
        for i in range(1, V+1):
            if adj[t][i] == 1 and visited[i] == 0:
                q.append(i)
                visited[i] == visited[t] + 1

def bfs2(s, V):
    q = []
    visited = [0] * (V+1)
    q.append(s)
    visited[s] = 1
    while q:
        t = q.pop(0)
        print(t)
        for i in adjList[t]:
            if visited[i] == 0 :
                q.append(i)
                visited[i] == visited[t] + 1

V, E = map(int, input().split())
edge = list(map(int, input().split()))
adj = [[0]*(V+1) for _ in range(V+1)] # 인접행렬 # 정점 수만큼
adjList = [[] for _ in range(V+1)]    # bfs2 추가


for i in range(E):                  # 노드 수만큼
    n1, n2 = edge[2 * i], edge[2*i + 1]
    adj[n1][n2] = 1                 # 방향 없는 그래프
    adj[n2][n1] = 1

    adjList[n1].append(n2)          # bf2 adjList
    adjList[n2].append(n1)

bfs(1, V)
# bfs2(1, V)



