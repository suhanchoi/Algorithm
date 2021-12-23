import sys

n = int(sys.stdin.readline())
nary = list(map(int,sys.stdin.readline().split()))

m = int(sys.stdin.readline())
mary = list(map(int,sys.stdin.readline().split()))
for i in range(m):
    n = nary.count(mary[i])
    print(n,end=' ')
    for j in range(n):
        nary.remove(mary[i])

print(nary)