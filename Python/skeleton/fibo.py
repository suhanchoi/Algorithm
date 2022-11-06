def mfibo(n):  # 메모이제이션
    global memo
    if n > 2 and len(memo) <= n: # 저장 됐는지 안됐는지 파악
        memo.append(mfibo(n - 1) + mfibo(n - 2))
    return memo[n]

def dpfibo(n): # 동적계획법으로 bottom-up 방식으로 구현
    f = [0, 1]

    for i in range(2, n+1):
        f.append(f[i-1]+f[i-2])

    return f[n]

memo = [0, 1]


