import sys

num = int(sys.stdin.readline())

ary = []

for i in range(num):
    ary.append(list(sys.stdin.readline().split()))

ary.sort(key = lambda word: int(word[0]))

for i in range(num):
    print(*ary[i]) # list 형태 말고 출력