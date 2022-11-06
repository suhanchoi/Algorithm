# 2차원 리스트
# delta 활용 2차 List 탐색

n = 10

arr = [[0] * (n - 1) for _ in range(n - 1)]

dx = [0, 0, -1, 1]  # 상하좌우
dy = [-1, 1, 0, 0]

for x in range(len(arr)):
    for y in range(len(arr[x])):
        for i in range(4):
            testX = x + dx[i]
            testY = y + dy[i]
            print(arr[testX][testY])

# 전치행렬
# zip 통해 쉽게 구하기 가능

for i in range(3):
    for j in range(3):
        if i < j:
            arr[i][j], arr[j][i] = arr[j][i], arr[i][j]

# print(list(zip(*arr))) * -> list를 행렬로 분리하는 역할