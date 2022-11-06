from sys import stdin

def fact(n):
    global result
    if n==1:
        return 1
    if result[n] == 0:
        result[n] = fact(n-1) * n # 메모이제이션
    return result[n]


num = int(stdin.readline())
result = [0] * (num+1)
result[0] = 1

result = fact(num)

cnt = 0

while True:
    if result % 10 != 0:
        break
    cnt += 1
    result //= 10 # /= 로 하면 런타임 에러

print(cnt)
