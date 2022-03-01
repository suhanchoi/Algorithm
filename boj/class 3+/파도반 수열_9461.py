from sys import stdin

# dp, 점화식

def check(n):
    global result

    if n < 6:
        print(result[n])
        return

    i = len(result)

    if i-1 < n:
        result.append(result[i - 1] + result[i - 5])
        check(n)
        return

    if len(result)-1 >= n:
        print(result[n])
        return

n = int(stdin.readline())

result = [0, 1, 1, 1, 2, 2]

for i in range(n):
    check((int(stdin.readline().strip())))