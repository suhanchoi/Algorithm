from sys import stdin


# dp, 재귀식

def check(n):
    global result

    if n < 4:
        print(result[n])
        return

    i = len(result)

    if i-1 < n:
        result.append(result[i - 1] + result[i - 2] + result[i - 3])
        check(n)
        return

    if len(result)-1 >= n:
        print(result[n])
        return


n = int(stdin.readline())

result = [0, 1, 2, 4]

for _ in range(n):
    check(int(stdin.readline().strip()))