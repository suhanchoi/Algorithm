# queue 사용
# 재귀 -> 시간, 메모리 초과

from collections import deque
# deque append, appendleft, pop, popleft

def card(ary): # 일반 list는 시간초과 deque로 구현
    while True:
        if len(ary) == 1:
            print(ary[0])
            return

        # ary.remove(ary[0])
        # ary.append(ary[0])
        # ary.pop(0)
        ary.popleft()
        ary.append(ary[0])
        ary.popleft()

num = int(input())

# nums = list(range(1,num+1)) # 일반 list는 시간초과
nums = deque(range(1,num+1)) # deque로 구현
card(nums)

