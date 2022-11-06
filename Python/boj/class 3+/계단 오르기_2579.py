from sys import stdin

# dp # 뒤집어서 생각
# 얻을 수 있는 점수의 최댓값
n = int(stdin.readline())

stairs = []

for i in range(n):
    stairs.append(int(stdin.readline().strip()))

dp = [0] # 누적된 최댓값
dp[0]= stairs[0] # 1층 설정

if 3 > n :
    print(sum(stairs))

else:
    # 1~2 초기 출발 설정
    dp.append(stairs[0]+stairs[1])
    dp.append(max(stairs[1]+stairs[2], stairs[0]+stairs[2]))

    for i in range(3,n): # i번째 계단 까지의 최댓값 설정
        dp.append(max(stairs[i]+stairs[i-1]+dp[i-3], stairs[i]+dp[i-2]))

    print(dp[n-1]) # dp[-1] 과 동일