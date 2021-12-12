# 211018
# stack 사용

def dfs(s, V):
    visited = [0]*(V+1)
    stack = []
    i = s # 현재 방문한 정점 i
    visited[i] = 1
    print(node[i])
    while i != 0: # True :
        for w in range(1, V+1):
            if adj[i][w] == 1 and visited[w] == 0:
                print(node[w])
                stack.append(i) # 방문 경로 저장
                i = w           # 새 방문지 이동
                visited[w] = 1
                print(node[i])
                break
            else:
                if stack:
                    i = stack.pop()
                else:
                    i = 0
                    #break


adj = [[]] # 인접행렬 선언

node = ['', 'A','G']


V, E = map(int, input().split())
ad = [[0]*(V+1) for _ in range(V+1)]
for _ in range(E):
    n1, n2 = map(int, input().split())
    ad[n1][n2] = 1
    ad[n2][n1] = 1
