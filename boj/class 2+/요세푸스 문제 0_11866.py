# N 개의 수 안에 K 번쨰 수를 빼고, 빼고난 이후 수가 1번쨰 수가 된다
import sys
from collections import deque

def chk(ary, k):
    global result

    deq = deque(ary)

    while len(deq) != 1:
        for i in range(k - 1):
            deq.append(deq.popleft())
        result.append(deq.popleft())

    result.append(deq.popleft())

    # 많은 재귀로 수정
    # if len(ary) == 1:
    #     result.append(deq.popleft())
    #     return
    #
    # for i in range(k-1):
    #     deq.append(deq.popleft())
    #
    # result.append(deq.popleft())

N, K = map(int, sys.stdin.readline().split())

ary = list(range(1, N + 1))
result = []
chk(ary, K)

print('<', end='')
for i in range(len(result)-1):
    print(result[i], end=', ')
print(f'{result[-1]}>')

