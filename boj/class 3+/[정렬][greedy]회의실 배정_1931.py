from sys import stdin

# 정렬, greedy

result = 1  # 사용할 수 있는 회의의 최대 개수
n = int(stdin.readline())
lst = []

for i in range(n):
    s, e = (map(int, (stdin.readline().split())))
    lst.append([s, e])

# 시작 시간과 끝나는 시간 고려해서 greedy 적으로 접근
lst.sort() # 1차적으로 정렬
sorted_list = sorted(lst, key=lambda x: x[1])  # 한번 더 끝나는 시간 기준으로 정렬

temp = sorted_list[0][1]
for i in range(1, n):
    if sorted_list[i][0] >= temp:
        temp = sorted_list[i][1]
        result += 1

print(result)