import sys, time
s_time = time.time()

a = int(input())
b = int(sys.stdin.readline())

c = map(int, sys.stdin.readline().split())
d = list(map(int, sys.stdin.readline().split()))

e = [list(map(int, sys.stdin.readline().split())) for _ in range (10)]
f = [[0] * 10 for _ in range(20)]

e_time = time.time()
print('time : ',e_time - s_time)