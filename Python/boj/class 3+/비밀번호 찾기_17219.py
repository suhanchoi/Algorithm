from sys import stdin

n, m = map(int, stdin.readline().split())

dct = {}

for i in range(n):
    url, pw = stdin.readline().split()
    dct[url] = pw

for i in range(m):
    print(dct.get(stdin.readline().strip()))


