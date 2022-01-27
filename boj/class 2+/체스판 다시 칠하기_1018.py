# 브루트포스

def chk(x,y): # x, y : 시작점
    cnt = 0
    temp = 0

    for i in range(8):
        for j in range(8):
            if i % 2 == 1: # 짝수줄
                if startB[j] != ary[i+x][j+y]:
                    temp +=1
            else:
                if startW[j] != ary[i+x][j+y]:
                    temp +=1

    for i in range(8):
        for j in range(8):
            if i % 2 == 1: # 짝수줄
                if startW[j] != ary[i+x][j+y]:
                    cnt +=1
            else:
                if startB[j] != ary[i+x][j+y]:
                    cnt +=1
    if temp > cnt:
        return cnt
    return temp


N, M = (map(int, input().split())) # N : 세로 줄 M : 가로줄
ary = [list(input()) for _ in range(N)] # 2차원 배 열 입력

startB = 'BW'*4
startW = 'WB'*4


result = 50 * 50 +1 # 최소값 할당

for i in range(N-7):
    for j in range(M-7):
        if result > chk(i,j):
            result = chk(i,j)
print(result)



