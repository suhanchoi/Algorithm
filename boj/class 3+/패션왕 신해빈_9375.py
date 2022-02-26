from sys import stdin
from collections import Counter

# 조합 문제
# (n+1) * (m+1) -1

t = int(stdin.readline())

for t in range(t):

    n = int(stdin.readline())

    lst = []

    for i in range(n):
        item, category = stdin.readline().split()

        lst.append(category) # 종류만 알면 된다

    counter = Counter(lst)
    result = 1
    if len(counter) == 1:
        print(counter[category])
    else:
        for i in counter: # i는 key 값 -> category
            result *= counter[i]+1
        print(result-1) # 빼는 이유는 아무것도 안하는 경우 제외
