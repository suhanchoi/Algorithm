import sys

def chk(nary, target): # 이진탐색 반복문
    start = 0
    end = len(nary) - 1

    while True:
        middle = (start + end) // 2

        if start > end:  # ??? re
            return False

        if nary[middle] > target:
            end = middle - 1

        elif nary[middle] < target:
            start = middle + 1

        else:
            return True

def binsearch(arr, target, start, end): # 이진탐색 재귀
    if start > end:
        print(0)
        return
    middle = (start + end) // 2
    if arr[middle] > target:
        return binsearch(arr, target, start, middle - 1)
    elif arr[middle] < target:
        return binsearch(arr, target, middle + 1, end)
    else:
        print(1)
        return

n = int(sys.stdin.readline())  # input() -> sys.stdin.readline() 입력 속도가 더 빠름
nary = list(map(int, sys.stdin.readline().split())) # set 으로 가져오고 in 으로 하면 더 빠름

m = int(sys.stdin.readline())
mary = list(map(int, sys.stdin.readline().split()))

nary.sort()

# for i in range(m):
#     chk(nary, mary[i])
#     binsearch(nary, mary[i], 0, len(nary) - 1)

for i in range(m):
    if chk(nary, mary[i]): # True or False 가 더 빠름
        print(1)
    else:
        print(0)

