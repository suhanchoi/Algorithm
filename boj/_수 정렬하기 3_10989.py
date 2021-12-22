import sys

num = int(sys.stdin.readline())

ary = []

for i in range(num):
    ary.append(int(sys.stdin.readline()))

ary.sort()

for i in range(num):
    print(ary[i])