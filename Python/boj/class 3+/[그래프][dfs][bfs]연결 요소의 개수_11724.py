from sys import stdin
# import sys

# sys.setrecursionlimit(100000000) # 재귀방식

# 그래프, dfs, bfs
# 연결 요소는 하나로 연결된 그래프 개수

def dfs(n):
    # visited[n] = True # 재귀방식
    st.append(n)

    while st:
        now = st.pop()

        # 재귀방식
        # for w in gr[now]: # recursionError -> sys.setrecursionlimit(10000000)
        #     if visited[w] == False:
        #         dfs(w)

        if d_visited[now] == False:
            st.extend(gr[now]) # 한 노드에 2개 이상 연결 시 모두 다 append -> extend
            d_visited[now] = True

def bfs(n):
    q.append(n)

    while q:
        now = q.pop(0)
        if b_visited[now] == False:
            q.extend(gr[now])
            b_visited[now] = True

result = 0
V, E = map(int, stdin.readline().strip().split())

# 간선에 방향이 없음
gr = [[] for _ in range(V + 1)]

for i in range(E):
    s, e = map(int, stdin.readline().strip().split())
    gr[s].append(e)
    gr[e].append(s)

d_visited = [False] * (V + 1)
b_visited = [False] * (V + 1)

st = []
q = []

for i in range(1, V + 1): # dfs
    if d_visited[i] == False:
        dfs(i)
        result += 1

# for i in range(1, V + 1): # bfs
#     if b_visited[i] == False:
#         bfs(i)
#         result += 1

print(result)