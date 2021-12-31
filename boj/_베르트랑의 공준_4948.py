from sys import stdin

n = 123456 * 2

prime = [True] * n

prime[0], prime[1] = False, False

# 소수 구하기
for i in range(2, int(n**(1/2))):
    j = i * i
    while j < n:
        prime[j] = False
        j += i

while True:
    num = int(stdin.readline())

    if num == 0:
        break

    cnt = 0
    for i in range(num+1, 2* num +1):
        if prime[i]:
            cnt +=1
    print(cnt)

