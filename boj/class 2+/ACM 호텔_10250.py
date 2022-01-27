num = int(input())

for t in range(num):
    H, W, N = list(map(int,input().split()))
    floor = N % H
    if floor == 0:
        floor = H
    if N % H == 0:
        number = N // H
    else:
        number = N // H +1
    if number < 10:
        print(str(floor)+'0'+str(number))
    else:
        print(str(floor)+str(number))