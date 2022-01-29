from sys import stdin

# dp
# 경우를 3 case로 나눠서 진행
n = int(stdin.readline())

result = [0] * (n+1)

for i in range(2,n+1): # 0:1. 1:1
    if i % 6 == 0:
        result[i] = min(result[i//3]+1,result[i//2]+1, result[i-1]+1)
    elif i % 3 == 0:
        result[i] = min(result[i//3]+1, result[i-1]+1)
    elif i % 2 == 0:
        result[i] = min(result[i//2]+1, result[i-1]+1)
    else:
        result[i] = result[i-1]+1

print(result[n])










