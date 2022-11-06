import heapq

# heapq
# heap : 부모의 값이 자식보다 항상 크거나 작다는 조건 만족(대소 관계 일정한) 완전 이진 트리이며
# 형제 사이에는 대소 관계 정해져 있지 않은 부분 순서 트리
# 최솟값 밑 최댓값은 루트에 위치 한다는 특징을 이용해 정렬

heap = []
n = 1

# 최소 힙
heapq.heappush(heap, n)
heapq.heappop(heap)

# 최대 힙
heap.headpush(heap,(-n, n))
heap.headpush(heap)