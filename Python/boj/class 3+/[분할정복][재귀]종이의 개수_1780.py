from sys import stdin

# 분할 정복, 재귀

def check(x, y, n):
    global lst,count1,count2,count3
    type = lst[x][y]
    if n != 1:
        for i in range(n):
            for j in range(n):
                if type != lst[x+i][y+j]:
                    n //= 3
                    check(x, y, n)
                    check(x + n, y, n)
                    check(x + (2 * n), y, n)
                    check(x, y + n, n)
                    check(x + n, y + n, n)
                    check(x + (2 * n), y + n, n)
                    check(x, (2 * n) + y, n)
                    check(x + n, (2 * n) + y, n)
                    check(x + (2 * n), (2 * n) + y, n)
                    return
    if type == -1:
        count1 += 1
    if type == 0:
        count2 += 1
    if type == 1:
        count3 += 1


n = int(stdin.readline())
lst = []

for i in range(n):
    lst.append(list(map(int, stdin.readline().strip().split())))

count1, count2, count3 = 0, 0, 0

check(0,0,n)

print(count1)  # -1
print(count2)  # 0
print(count3)  # 1