import sys

def chk(n):
    n = str(n)
    cnt = 0
    for i in range(len(n) - 1):
        if n[i] == '6' and n[i + 1] == '6':
            cnt += 1
        else:
            cnt = 0
        if cnt > 1:
            return True
    return False

num = int(sys.stdin.readline())

result = []

i = 666
while True:
    if len(result) == num:
        print(result[num - 1])
        break

    if chk(i):
        result.append(i)

    i += 1
