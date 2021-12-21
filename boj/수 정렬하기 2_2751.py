import sys # 속도가 더 빠름

num = int(input())

ary = []

for i in range(num):
    ary.append(int(sys.stdin.readline()))

ary.sort()

for i in range(num):
    print(ary[i])