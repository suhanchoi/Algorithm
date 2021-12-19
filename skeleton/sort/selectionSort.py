def selectionSort(a):  # 구간 중 최소값을 맨 앞과 변경하는 정렬
    for i in range(0, len(a) - 1):
        min = i
        for j in range(i + 1, len(a)):
            if a[min] > a[j]:
                min = j
            a[i], a[min] = a[min], a[i]
