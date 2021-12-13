t = int(input())

def dfs(v):
    # st = []
    # visited = [False] * (v+1)
    #
    # visited[v] = True
    # st.append(v)

    while st:
        v = st.pop(-1)
        # print(v)
        if v==g:
            return 1
        for w in gr[v]:
            if visited[w] == False:
                st.append(w)
                visited[w] = True
    return 0

for t in range(t):
    v, e = map(int, input().split())
    gr = [[] for _ in range(v+1)]

    for i in range(e):
        v1, v2 = map(int, input().split())
        gr[v1].append(v2)

    # print(gr)

    st = []
    visited = [False] * (v+1)

    visited[v] = True
    st.append(v)

    s,g = map(int, input().split())
    print(f'#{t+1} {dfs(s)}')