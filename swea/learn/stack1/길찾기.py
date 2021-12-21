# stack 활용
# dfs
def dfs(s):
    visited = [0] * 100
    st = []

    visited[s] = 1
    st.append(s)

    while st:
        v = st.pop(-1) # 경로에서 pop 하고 v에 할당

        if v == 99: # B:99 목적지 도착
           return 1

        for w in G[v]: # v 의 주변 정점 w
            if visited[w] == 0: # 만약 w에 방문 안했다면,
                st.append(w)
                visited[w]=1
    return 0

for t in range(10):

    result = 0
    testcase_num, num = map(int, input().split())

    G = [[] for _ in range(100)]

    nodes = list(map(int, input().split()))

    for i in range(0,num):
        a, b = nodes[2*i], nodes[2*i+1]
        G[a].append(b)
        
    result = dfs(0) # 출발 A:0 으로 고정

    print(f'#{t + 1} {result}')
