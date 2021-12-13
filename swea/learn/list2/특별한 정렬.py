# solved
t = int(input())

def myMax(l):
    max = 0
    n = len(l)
    for i in range(1, n):
        if l[max] < l[i]:
            max = i
    return max

def myMin(l):
    min = 0
    n = len(l)
    for i in range(1, n):
        if l[min] > l[i]:
            min = i
    return min

for kk in range(t):
    n = int(input())
    ary = list(map(int,input().split()))

    for i in range(0, n): # 0 1 2 3 4 ... 9
        if i % 2 == 0:
            max = i + myMax(ary[i:])
            ary[max], ary[i] = ary[i], ary[max]
        else:
            min = i + myMin(ary[i:])
            ary[min], ary[i] = ary[i], ary[min]

    print(f'#{kk+1}', end=' ')

    for k in range(10):
        print(ary[k], end=' ')
    print()
