num1, num2 = map(int, input().split())

if num1 > num2:
    max = num1
    min = num2
else:
    max = num2
    min = num1

for i in range(min, -1, -1):
    if min % i ==0 and max % i == 0:
        big = i
        print(big) # 최대공약수
        break

small = max // big * min // big * big
print(small)