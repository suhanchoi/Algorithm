import sys

n = int(sys.stdin.readline())
nary = list(map(int,sys.stdin.readline().split()))

m = int(sys.stdin.readline())
mary = list(map(int,sys.stdin.readline().split()))
for i in range(m):
    print(nary.count(mary[i]),end=' ')