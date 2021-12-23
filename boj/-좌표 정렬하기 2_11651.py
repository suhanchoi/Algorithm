import sys

num = int(sys.stdin.readline())
ary = []

for i in range(num):
    ary.append(list(map(int,(sys.stdin.readline().split()))))

ary.sort(key = lambda word: (word[1],word[0]))

for i in range(num):
    print(*ary[i])