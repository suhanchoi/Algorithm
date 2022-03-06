from sys import stdin

n, t = map(int, (stdin.readline()).split())

lst = list(map(int, stdin.readline().strip().split()))

# 미리 누적합을 만들어 둔 다음에 b - a 해서 결과 출력

result = [0, lst[0]]
for i in range(1, n):
    result.append(result[-1] + lst[i])

for i in range(t):
    a, b = map(int, (stdin.readline()).split())
    # print(sum(lst[a-1:b])) # 시간 초과
    print(result[b] - result[a-1])