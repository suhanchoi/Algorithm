from sys import stdin

# 분할정복, 재귀

# 0,0 -> 0,1 -> 1.0 -> 1,1 #Z 모양 이동 #(행,열)

def check():
    pass

N, r, c = map(int,stdin.readline().split())
# 2의 N 제곱 * 2의 N 제곱
# (r,c)는 몇번쨰 방문하는지 출력
# 재귀적으로 반복해서 4등분

print(N,r,c)

