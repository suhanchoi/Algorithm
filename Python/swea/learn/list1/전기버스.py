t = int(input())
for i in range(t):
    # k : 한번에 이동하는 정류장 수
    # n : 목적인 종점 정류장 번호
    # m : 설치된 정류장 번호
    k, n, m = map(int, input().split())
    idxs = list(map(int, input().split()))

    lo = [0] * (n+1+k)

    for h in idxs:
        lo[h] += 1

    a = 0
    blankcnt = 0
    result = 0

    for j in range(n+1): # 도착 X 경우 -> 0 출력
        if lo[j] == 1:
            b = j
            blankcnt = 0

            if (b-a) > k: # 충전기간 거리가 k 보다 크면 X
                print(f'#{i+1} 0')
                break
            a = j
        else:
            blankcnt += 1
            if blankcnt > k: # 충전기가 소외된 구간이 k보다 크면 X
                print(f'#{i + 1} 0')
                break

    # for else break 가 안됐을 경우 출력
    else: # greedy로 접근
        idx = 0
        while idx + k < n:
            term = k
            if lo[idx+term] == 1:
                idx += term
                result += 1
            else:
                while lo[idx+term] != 1:
                    term -= 1
                idx += term
                result += 1

        print(f'#{i+1} {result}')
