from sys import stdin

# 메모이제이션
# num-1, num의 인자를 출력하는것이 정답

def fibo(n):
    global result, cnt0, cnt1

    if n == 0:
        result[0] = 0
        return 0
    if n == 1:
        result[1] = 1
        return 1

    if result[n] == 0:
        result[n] = fibo(n-1) + fibo(n-2)
    return result[n]

    return fibo(n-1) + fibo(n-2)

n = int(stdin.readline())

for i in range(n):
    num = int(stdin.readline())

    if num == 0: # 0은 1번 출력일 경우
        print(1,0)
        continue

    else:
        cnt0 = 0
        cnt1 = 0
        result = [0] * 41

        fibo(num)
        print(result[num-1], result[num])
