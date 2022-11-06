from sys import stdin

string =int(stdin.readline())

ary = []

while True:
    temp = string % 10
    ary.append(temp)
    if string // 10 == 0:
        break
    string //= 10
ary = sorted(list(ary),reverse=True)

for i in ary:
    print(i,end='')
