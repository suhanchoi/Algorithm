from sys import stdin

# 정렬, 값 / 좌표 압축
# 좌표간 거리를 압축

n = int(stdin.readline())

lst = list(map(int, stdin.readline().strip().split()))

mylst = sorted(list(set(lst)))

mydict = dict()

for i in range(len(mylst)):
    mydict[mylst[i]] = i
    # 시간 초과 방지 위해 dict = hashmap으로 풀이

for i in lst:
    print(mydict[i], end=" ")
    # index로 풀면 시간초과