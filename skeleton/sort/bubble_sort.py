def BubbleSort(a):
    for i in range(len(a) - 1, 0, -1):  # 범위의 끝
        for j in range(0, i):  # 0 부터 i 까지
            if a[j] > a[j + 1]:
                a[j], a[j + 1] = a[j + 1], a[j]
