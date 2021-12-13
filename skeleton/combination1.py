# 조합1
# 0 부터 9 까지 3개의 부분집합 출력
for i in range(8):
    for j in range(i+1, 9):
        for k in range(j+1, 10):
            print(i, j, k)

# n 개에서 r 개를 고르는 조합 (재귀)

def nCr(n, r, s, k): # n개에서 r개를 고르는 조합, s: 선택할 수 있는 구간의 시작 k 고른 개수
    if k == r:
        print(*comb) # * : 대괄호, 콤마 제거
    else:
        for i in range(s, n-r+k+1):
            comb[k] = i
            nCr(n, r, i+1, k+1)

N = 10
R = 3
comb = [0] * R
nCr(N, R, 0, 0)

# 비트 연산자 활용 부분집합
bits = 5
for i in range(1 << bits):  # 2의 12제곱 만큼의 부분집합 갯수
    sum = 0                 # 4096 개의 부분집합
    cnt = 0
    for j in range(bits):  # 부분집합 구현 부분
        if i & (1 << j):   # i에서 j번째 비트가 1인지 아닌지 확인
            cnt = cnt + 1  # 즉 4096 개에서 몇번쨰 원소가 들어가있는지 원소 개수만큼 돌면서 있는지 chk
