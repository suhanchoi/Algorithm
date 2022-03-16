from sys import stdin

# 그래프, dfs, bfs
# 연결 요소는 하나로 연결된 그래프 개수

def dfs(n):
    pass

result = 0
V, E = map(int,stdin.readline().strip().split())

# 간선에 방향이 없음
lst = [[] for _ in range(V+1)]

print(lst)

for i in range(E):
    s, e = map(int,stdin.readline().strip().split())
    print(s,e)
    lst[s].append(e)
    lst[e].append(s)

print(lst)

visited = [False] * (V+1)
st = []

for i in range(len(lst)):
    dfs(i)

print(result)
