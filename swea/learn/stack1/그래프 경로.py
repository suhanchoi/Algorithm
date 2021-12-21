# stack
# dfs

t = int(input())

def dfs(v): # v 는 시작점
    # st = []
    # visited = [False] * (v+1)
    visited[v] = True
    st.append(v)

    while st:
        v = st.pop(-1)
        print(v)
        # if v == goal: # 종료 조건
        #     return 1

        for w in gr[v]: # w 는 v의 정점 중에서 인접한 정점
            if visited[w] == False:
                st.append(w)
                visited[w] = True
    return 0

for t in range(t):
    V, e = map(int, input().split())
    gr = [[] for _ in range(V + 1)]

    for i in range(e):
        v1, v2 = map(int, input().split())
        gr[v1].append(v2)

    start, goal = map(int, input().split())

    st = []
    visited = [False] * (V + 1)

    # visited[V] = True
    # st.append(V)

    # print(gr)

    print(f'#{t + 1} {dfs(start)}')


'''

---------------------------------------------------------------------------------
                                    참고코드
---------------------------------------------------------------------------------

'''
'''
def findw(v):
    for i in range(len(adj[v])):
        if adj[v][i] == 1 and visited[i] == False: # 인접행렬
            return i
    return -1

def dfs(s, g):
    visited[s] = True
    #print(s)
    stack.append(s)
    while len(stack) > 0:
        w = findw(s)
        if w == g :
            return 1
        elif w != -1:
            stack.append(s)
            visited[w] = True
            #print(w)
            s = w
        else:
            s = stack.pop(-1)
    return 0


tc = int(input())

for t in range(tc):
    node, line = map(int, input().split())
    adj = [[0]*(node+1) for _ in range(node+1)]

    for i in range(line):
        s_node, g_node = map(int, input().split())
        adj[s_node][g_node] = 1 # 방향이 있을때 단방향
        # 방향이 없을 때 adj[g_node][s_node] = 1

    start, goal = map(int, input().split())
    visited = [False] * (node+1)
    stack = []
    result = dfs(start, goal)
    print('#{} {}'.format(t+1, result))


#==================================================
# goal에 도달하면 1을 return하고
# 아니면 0 을 return하는 함수
def dfs(v): # 일반행렬 사용
    ST = []
    visited = [False] * (v+1)

    visited[v] = True
    ST.append(v)
    while ST:
        v = ST.pop(-1)
        if v ==gr:
            return 1
        for w in gr[v]: # 인접했다
            if visited[w] == False:
                ST.append(w)
                visited[w] = True
    return 0

tc = int(input())
tc = 1

for t in range(tc):
    v, e = map(int, input().split())
    gr = [[] for _ in range(v+1)]
    for i in range(e):
        v1, v2 = map(int, input().split())
        gr[v1].append(v2)
    s, g = map(int, input().split())
    print(dfs(s))


#==================================================
def dfs_adj(v): # 인접행렬 사용
    ST = []
    visited = [False] * (v+1)

    ST.append(v)
    visited[v] = True
    while ST:
        v = ST.pop(-1)
        if v ==gr:
            return 1
        for w in range(v+1): # 인접했다
            if adj[v][w] == 1 and visited[w] == False:
                ST.append(w)
                visited[w] = True
    return 0
'''