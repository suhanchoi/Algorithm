from sys import stdin

n, m = map(int, stdin.readline().split())

nset = set()
mset = set()

for i in range(n):
    nset.add(stdin.readline().strip())

for i in range(m):
    mset.add(stdin.readline().strip())

result = sorted(list(nset&mset))

print(len(result))
for i in result:
    print(i)

