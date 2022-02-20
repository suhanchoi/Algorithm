# 211018
# 비선형 구조인 그래프 구조
# stack 사용
# 깊이 우선 탐색

'''
def dfs(s, V):
    visited = [0]*(V+1)
    stack = []
    v = s # 현재 방문한 정점 i
    visited[v] = 1
    print(node[v])
    while v != 0: # True :
        for w in range(1, V+1):
            if adj[v][w] == 1 and visited[w] == 0:
                print(node[w])
                stack.append(v) # 방문 경로 저장
                v = w           # 새 방문지 이동
                visited[w] = 1
                print(node[v])
                break
            else:
                if stack:
                    v = stack.pop()
                else:
                    v = 0
                    #break


adj = [[]] # 인접행렬 선언

node = ['', 'A','G']


V, E = map(int, input().split())
ad = [[0]*(V+1) for _ in range(V+1)]
for _ in range(E):
    n1, n2 = map(int, input().split())
    ad[n1][n2] = 1
    ad[n2][n1] = 1


'''

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

