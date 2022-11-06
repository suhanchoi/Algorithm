from sys import stdin

# greedy

n = int(stdin.readline())

lst = list(map(int, stdin.readline().strip().split()))

lst.sort()

result = 0

k = len(lst)

for i in lst:
    result += i * k
    k -= 1

print(result)