from sys import stdin

# dp

def check(n):
    global result
    i = len(result)-1

    if n == 1:
        print(1)
        return

    while i < n:
        result.append(result[-1]+result[-2])
        i = len(result) - 1

    print(result[-1]%10007)
    return


n = int(stdin.readline())

result = [0, 1, 2]

check(n)
