# solved
t = int(input())


def myMax(l):
    maxidx = 0
    n = len(l)
    for i in range(1, n):
        if l[maxidx] < l[i]:
            maxidx = i
    return maxidx


def myMin(l):
    minidx = 0
    n = len(l)
    for i in range(1, n):
        if l[minidx] > l[i]:
            minidx = i
    return minidx

for kk in range(t):
    n = int(input())
    ary = list(map(int, input().split()))

    for i in range(0, n):  # 0 1 2 3 4 ... 9
        if i % 2 == 0:
            maxidx = i + myMax(ary[i:])
            ary[maxidx], ary[i] = ary[i], ary[maxidx]
        else:
            minidx = i + myMin(ary[i:])
            ary[minidx], ary[i] = ary[i], ary[minidx]

    print(f'#{kk + 1}', end=' ')

    for k in range(10):
        print(ary[k], end=' ')
    print()
