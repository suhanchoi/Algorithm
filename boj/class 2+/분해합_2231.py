num = int(input())
sum = 0
for i in range(num):
    cnum = i
    sum += i
    while(cnum>0):
        sum += cnum%10
        cnum = cnum//10
    if sum == num:
        print(i)
        break
    sum = 0
    if i == num-1:
        print(0)