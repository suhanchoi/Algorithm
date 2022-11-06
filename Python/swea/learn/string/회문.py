# 가로로읽기, 세로로 읽기

t = int(input())

def reversechk(str): # 회문 체크
    for i in range(len(str)):
        if str[i]!=str[len(str)-1-i]:
            break
        if i == len(str)//2:
            return True

    return False


for t in range(t):
    n, m = map(int,input().split()) # n * n , 길이가 m 인 회문 찾아서 출력
    ary = list(input() for _ in range(n))

    for i in range(n):
        for j in range(n-m+1):
            if reversechk(ary[i][j:j+m]):
                print(f'#{t+1} {ary[i][j:j+m]}')
                break


    for i in range(n):
        for j in range(n-m+1):
            temp = ""
            for k in range(j,j+m): # 세로로 읽어들여서
                temp += (ary[k][i])

            if reversechk(temp): # 회문 체크
                print(f'#{t + 1} {temp}')
                break