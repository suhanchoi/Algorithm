from sys import stdin

# 재귀로 풀이
# 0 하얀색 종이수
# 1 파란색 종이수

def check(x,y,n):
    global cnt0, cnt1
    color = lst[x][y]

    for i in range(x,x+n):
        for j in range(y,y+n):
            if lst[i][j] != color:
                n //= 2
                # 4분할
                check(x,y,n)
                check(x+n,y,n)
                check(x,y+n,n)
                check(x+n,y+n,n)
                return # 4분할 했으므로 return
    if color == 0:
        cnt0 += 1
        return
    if color == 1:
        cnt1 += 1
        return


n = int(stdin.readline())

lst = [[] for _ in range(n)]

for i in range(n):
    lst[i] = list(map(int,stdin.readline().split()))

cnt0, cnt1 = 0,0

check(0,0,n)

print(cnt0)
print(cnt1)

