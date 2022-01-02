from sys import stdin

# 땅을 파고 그 블록을 인벤토리에 넣는 시간 2초
# 땅에 인벤토리에 있는 블록 한개 올리는 시간 1초

N, M, B = map(int, stdin.readline().split()) # B : 인벤토리에 있는 블록 수

ary = [list(map(int, stdin.readline().split())) for _ in range(N)]

print(ary)

# result 땅을 고르는데 걸리는 최소 시간, 고르고 난 후의 땅의 높이 출력