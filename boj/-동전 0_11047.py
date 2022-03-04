from sys import stdin

# greedy
# 앞 동전의 가치가 전 동전의 배수

def check(n):
    global lst, result
    i = len(lst) - 1

    # while n > 0:
    #     while lst[i] > n: # 시간초과 이진탐색 도입
    #         i -= 1
    #     n -= lst[i]
    #     result += 1

    lst.sort(reverse=True)
    for i in lst:
        if i <= n: # 같아야 동전 가치 딱 맞음
            result += n // i  # i 는 동전 가치 result는 해당 개수
            n -= i * result

    return result


n, k = map(int, stdin.readline().split())
# n은 동전의 종류, k는 원하는 result 

lst = []
result = 0

for i in range(n):
    lst.append(int(stdin.readline().strip()))

print(check(k))
