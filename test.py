import sys
num = int(sys.stdin.readline())

ary = []
for i in range(num):
    ary.append(int(sys.stdin.readline()))

ary = sorted(list(set(ary)))

for i in ary:
    print(i)