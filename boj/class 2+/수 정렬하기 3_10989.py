import sys

num = int(sys.stdin.readline())

ary = [0] * 10001

for i in range(num):
    ary[int(sys.stdin.readline())] += 1  # 메모리 부족으로 인해 카운트 하고 바로 실행

cnt = 0
for i in range(10001):
    if ary[i] != 0:
        for j in range(ary[i]):
            print(i)
            cnt += 1
    if cnt == num:
        break
