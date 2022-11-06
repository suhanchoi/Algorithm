#211014 이진트리 전위 중위 후위 순회

'''

정점의 수
간선

13
1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13

'''

def pre_order(n): # 전위순회 1 2 3
    if n :          # 유효한 정점이면 # ??? null 이 아니면?
        print(n)
        pre_order(left[n])        # n의 왼쪽 자식으로 이동
        pre_order(right[n])        # n의 오른쪽 자식으로 이동

def in_order(n): # 중위순회 2 1 3
    if n :
        in_order(left[n])
        print(n)
        in_order(right[n])

def post_order(n): # 후위순회 2 3 1
    if n:
        post_order(left[n])
        post_order(right[n])
        print(n)

V = int(input()) # 정점 갯수 입력
edge = list(map(int, input().split())) # 간선들을 리스트 형태로 저장

E = V - 1                   # V 개 정점이 있는 트리의 간선 수
left = [0] * (V+1)          # 부모를 인덱스 자식번호 저장
right = [0] * (V+1)

for i in range(E):
    p, c = edge[i * 2], edge[i * 2 +1] # 간선 읽어오기

    if left[p] == 0:        # p 의 왼쪽 자식이 없으면
        left[p] = c
    else:                   # 왼쪽 자식이 있으면 오른쪽 자식으로 저장
        right[p] = c

pre_order(1) # 시작 정점1
