# 이향 계수 (N)
#          (K) -> nCk = n! / k!(n-k)!
# 팩토리얼, 재귀, 메모이제이션

def fact(num):
    if num == 1 or num == 0:
        f[1] = 1
        return 1
    else:
        if f[num - 1] == 0:
            f[num] = fact(num - 1) * num
        else:
            f[num] = f[num - 1] * num
        return f[num]


N, K = list(map(int, input().split()))
f = [0] * (N+1)
result = int(fact(N) / (fact(K) * fact(N-K)))
print(result)
