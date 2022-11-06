from sys import stdin

# 그래프 문제
# dfs 활용
def dfs(v):
    global result
    visited[v] = True
    st.append(v)

    while st:
        v = st.pop(-1)

        for w in gr[v]:
            if visited[w] == False:
                st.append(w)
                result += 1
                visited[w] = True

n = int(stdin.readline())
m = int(stdin.readline())

gr = [[] for _ in range(n+1)]

for i in range(m):
    v1, v2 = map(int, stdin.readline().rstrip().split())
    gr[v1].append(v2)
    gr[v2].append(v1) # 거꾸로 감염이 가능

# 시작점
s = 1
st = []

result = 0

visited = [False] * (n+1)

dfs(s)

print(result)