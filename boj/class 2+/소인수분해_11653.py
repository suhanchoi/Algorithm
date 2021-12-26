from sys import stdin

num = int(stdin.readline())

''' ************* 소수를 구할 필요가 없다! ******************** '''

# 소수를 10,000,000 의 루트 +1 까지 구하고
# 소수로 나눠서 소인수 분해

# 소수 구하기
# n = num
#
# prime = [True] * (n + 1)
# prime[0], prime[1] = False, False
#
# for i in range(int(n ** (1 / 2)) + 1):
#     if prime[i]:  # True
#         j = i * i
#         while j <= n:
#             prime[j] = False
#             j += i
#
# sosu = []
#
# for i in range(n+1):
#     if prime[i]:
#         sosu.append(i)

# 소인수 분해
i = 2 # 제일 작은 소수 ㅊ기화

while True:
    if num % i == 0:
        num //= i
        print(i)
    else:
        i += 1
    if num == 1:
        break
