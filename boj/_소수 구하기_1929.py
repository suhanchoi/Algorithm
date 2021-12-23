import sys

a,b = map(int,sys.stdin.readline().split())

so = []

for i in range(a,b+1):
    cnt = 0
    if i == 2:
        print(2)
    if i > 2:
        for j in range(2,i):

            if (i) % j== 0:
                if j > (i//2+1):
                    break
                cnt += 1
                break

        if cnt == 0:
            print(i)
