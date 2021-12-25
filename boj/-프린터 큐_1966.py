import sys
from collections import deque
t_num = int(sys.stdin.readline())

for t in range(t_num):
    num, target = map(int, sys.stdin.readline().split())
    deq = deque(map(int, sys.stdin.readline().split()))
    idx = deque([False]*num) # idx 로 확인 # 튜플 형태나, dict으로도 구현 가능
    idx[target] = True
    cnt = 0

    while True:
        if deq[0] == max(deq):
            cnt += 1
            deq.popleft()
            if idx[0]: # 만약 원했던 idx가 나온 idx 랑 갔다면,
                print(cnt) # 답 출력
                break
            else:
                idx.popleft()

        else:
            deq.append(deq.popleft())
            idx.append(idx.popleft())


