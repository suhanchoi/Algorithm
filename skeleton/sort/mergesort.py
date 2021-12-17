def mergesort(arr):
    global cnt

    if len(arr)==1:
        return arr
    else:
        m = len(arr)//2 # 문제에서 주어진 조건
        left = arr[:m]
        right = arr[m:]
        left = mergesort(left)
        right = mergesort(right)

        idxL = 0
        idxR = 0
        i = 0 # 병합된 배열의 인덱스

        if left[-1] > right[-1]:
            cnt += 1

        # while idxL < len(left) or idxR < len(right):
        while i < len(arr):
            if idxL < len(left) and idxR < len(right):
                if left[idxL] < right[idxR]:
                    arr[i] = left[idxL]
                    idxL += 1
                else:
                    arr[i] = right[idxR]
                    idxR += 1
            elif idxL < len(left):
                arr[i] = left[idxL]
                idxL += 1
            else:
                arr[i] = right[idxR]
                idxR += 1
            i += 1

        return arr

T = int(input())
for tc in range(1, T+1):
    N = int(input())
    arr = list(map(int, input().split()))
    cnt = 0
    arr = mergesort(arr)
    print(f'#{tc} {arr[N//2]} {cnt}')



# def tree:
#     bintree = 5
#     for i in range(tc):
#         bintree += 1
#
#     return bintree