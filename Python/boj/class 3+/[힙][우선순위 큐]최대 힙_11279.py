from sys import stdin
import heapq # 최소 힙 자료구조 제공

# 힙, 우선순위 큐
# heapq
# heap : 부모의 값이 자식보다 항상 크거나 작다는 조건 만족(대소 관계 일정한) 완전 이진 트리이며
# 형제 사이에는 대소관계 정해져 있지 않은 부분 순서 트리
# 최솟값 밑 최댓값은 루트에 위치한다는 특징을 이용해 정렬

def heappush(n):
    heapq.heappush(heap,(-n,n)) # 최소 힙 활용해서 최대 힙 구현

def heappop():
    if len(heap) > 0:
        heap_max = heapq.heappop(heap)[1]
        print(heap_max)
    else:
        print(0)

n = int(stdin.readline())
heap = []

for i in range(n):
    x = int(stdin.readline())
    if x == 0:
        heappop()
        continue
    heappush(x)