def chk(nary, target):
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

def binsearch(arr, target, start, end): # 재귀
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