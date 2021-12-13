# ??? 비트 연산자 활용 부분 집합 re




def nCr(n, r, s, k): # n개에서 r개를 고르는 조합, s: 선택할 수 있는 구간의 시작 k 고른 개수
    global newresult
    if k == r:
        tempsum = 0
        for i in range(r):
            tempsum += comb[i]
        if tempsum == wantsum:
            # print(*comb) # * : 대괄호, 콤마 제거
            newresult += 1
    else:
        for i in range(s, n-r+k+1):
            comb[k] = i+1
            nCr(n, r, i+1, k+1)

t = int(input())
# 1부터 12까지의 숫자를 원소로 가진 집합 A

for t in range(1,t+1):
    # n : 원소의 개수
    # k : 위 원소 개수에 맞는 합
    n, k = map(int,input().split())
    mylist = list(range(1,13)) # 1부터 12까지의 숫자를 원소로 가진 집합
    bits = 12
    result = 0

    wantsum = k
    N = 12  # 집합의 크기
    R = n  # 원소의 개수
    comb = [0] * n
    newresult = 0
    nCr(N, R, 0, 0)

    # 비트 연산자 활용
    for i in range(1<<bits): # 2의 12제곱 만큼의 부분집합 갯수
        sum = 0
        cnt = 0
        for j in range(bits): # 부분집합 구현 부분
            if i & (1<<j): # i에서 j번째 비트가 1인지 아닌지 확인
                sum = sum + mylist[j]
                cnt = cnt + 1
        if cnt == n and sum == k: # cnt 는 부분집합 원소의 개수
            result = result +1

    # print(f'#{t} {result}')
    print(f'#{t} {newresult}')

'''
input
3
3 6
5 15
5 10

output
#1 1
#2 1
#3 0
'''
