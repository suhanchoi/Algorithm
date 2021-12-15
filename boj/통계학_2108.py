import sys

num = int(sys.stdin.readline())
# num = int(input())

ary = []

for i in range(num):
    ary.append(int(sys.stdin.readline()))

ary.sort()

# 평균 소수 1번째 자리에서 반올림
# 중앙값
# 최빈값, 여러개라면 최빈값중 두번쨰로 작은거
# 범위

cnt = [0] * 8001

mode = 0
for i in range(num):
    cnt[ary[i]+4000] += 1 # idx 마이너스 최대 범위 만큼 올리기

max_times = max(cnt)

mode = cnt.index(max_times) -4000 # 최빈값의 idx

# print(mode)
ccnt = 0 # 두번째로 작은 최빈값 count

for i in range(8001):
    if cnt[i] == max_times:
        ccnt += 1
        if ccnt == 2:
            mode = i - 4000
            break
if sum(ary)//num > 0:
    avg = int((sum(ary)//num)+0.5)
else:
    avg = int((sum(ary)//num)-0.5)
print(avg)
print(ary[num//2])
print(mode)
print(max(ary)-min(ary))