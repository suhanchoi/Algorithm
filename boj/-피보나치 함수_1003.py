from sys import stdin

n = int(stdin.readline())

for i in range(n):
    m = int(stdin.readline())



for i in range(n):
    url, pw = stdin.readline().split()
    dct[url] = pw

for i in range(m):
    print(dct.get(stdin.readline().strip()))


