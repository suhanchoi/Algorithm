import sys

def chk(nary, target):
    nary.sort()
    start = 0
    end = len(nary)-1
    middle = (start + end) // 2

    while nary[middle] != target:
        if target == nary[end]:
            print(1)
            return
        if nary[middle] > target:
            end = middle
        else:
            start = middle
        middle = (start + end) //2
        if target < start or target > end:
            print(0)
            return
    print(1)


# n = int(input())
# nary = list(map(int, input().split()))
#
# m = int(input())
# mary = list(map(int, input().split()))

n = int(sys.stdin.readline()) # 입력 속도가 더 빠름
nary = list(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline())
mary = list(map(int, sys.stdin.readline().split()))

for i in range(m):
    chk(nary, mary[i])
