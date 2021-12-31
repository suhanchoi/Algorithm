# pypy 로 제출해서 정답
import sys
from collections import Counter
# num : 나무의 수,
# target이 원하는 나무의 길이
num, target = map(int, sys.stdin.readline().split())

ary = list(map(int, sys.stdin.readline().split())) # 개수는 num
counter = Counter(ary)
result = max(ary)+1
cnt = 0

def midsum(mid):
    sum = 0
    for k,v in counter.items():
        if k>mid:
            sum += (k-mid)*v # v는 갯수
    return sum


l = 0
r = 1000000000

while l <= r:
    m = (l+r)//2
    cnt = 0

    # for i in ary:
    #     if i - m > 0: # 여기서 시간초과 #Counter로도 문제 풀이 가능 dict 속도 빠름
    #         cnt += i - m

    cnt = midsum(m)

    if cnt < target:
        r = m-1
    else:
        l = m+1
        result = m

print(result)


#.

