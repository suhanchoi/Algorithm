# 소수 구하기는 그 수의 루트 +1 까지만으로 나눠보면 소수 판단 시간 절약 가능

# 나중에 에라토스테네스의 체 적용 !

import sys

a, b = map(int, sys.stdin.readline().split())

# so = [] # 6224ms
#
# for i in range(a, b + 1):
#     cnt = 0
#     if i == 2:
#         print(2)
#     if i > 2:
#         for j in range(2, int(i ** (1/2)) +1): # 루트 적용 +1
#             if i % j == 0:
#                 break
#         else:
#             print(i)


# sosu 에라토스테네스의 체 # 516ms

sosu = [True] * (b + 1)
sosu[0], sosu[1] = False, False

for i in range(2, int(b ** (1 / 2)) + 1):
    if sosu[i]:  # True
        j = i * i  # 처음에는 제곱 제외
        while j <= b:
            sosu[j] = False
            j += i  # 그 이후에는 i 만큼씩 올리면서 제외

# print('에라토스테네스의 체 적용')
for i in range(a, b + 1):
    if sosu[i]:
        print(i)
