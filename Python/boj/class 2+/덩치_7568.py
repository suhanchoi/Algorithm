import sys

num = int(sys.stdin.readline())

ary = []

for i in range(num):
    ary.append(list(map(int,sys.stdin.readline().split())))

result = []

for i in range(num):
    cnt = 1 # 순위이므로 1위부터 시작
    for j in range(num):
        if ary[i][0] < ary[j][0] and ary[i][1] <ary[j][1]:
            cnt += 1
    result.append(cnt)

for i in result:
    print(i, end=' ')
