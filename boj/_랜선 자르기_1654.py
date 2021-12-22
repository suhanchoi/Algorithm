import sys
# 랜선의 개수 K, 만들어야 하는 일정한 랜선 개수 N
# result 만들수 있는 일정한 랜선의 최대값

K, N = map(int,sys.stdin.readline().split())

kary = []

for i in range(K):
    kary.append(int(sys.stdin.readline()))

print(kary)