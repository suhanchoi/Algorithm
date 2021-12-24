import sys

num = int(sys.stdin.readline())

ary = []

for i in range(num):
    ary.append(int(sys.stdin.readline()))

ary = sorted(ary)

for i in range(num):
    sys.stdout.write(str(ary[i]) + '\n')