import sys
# 랜선의 개수 K, 만들어야 하는 일정한 랜선 개수 N
# result 만들수 있는 일정한 랜선의 최대값

K, N = map(int,sys.stdin.readline().split())

kary = []

for i in range(K):
    kary.append(int(sys.stdin.readline()))

result = max(kary) # 배열에서의 최소값이 자를 수 있는 최대값
cnt = 0

# 1하나씩 줄여나가는것 보다 이분 탐색이 더 빠름
# while True:
#     for i in range(K):
#         cnt += kary[i] // result
#     if cnt >= N:
#         break
#     result -= 1
#     cnt = 0

r = result
l = 1

while l <= r: # 끝나는 조건
    m = (r+l)//2
    total = 0
    for i in kary:
        total += i // m
    if total < N: # 중간 값 즉 나누는 값이 너무 큼
        r = m-1
    else: # total >= N
        l = m+1
        result = m # 핵심

print(result)


