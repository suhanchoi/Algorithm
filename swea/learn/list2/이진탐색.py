# 400 못찾음
t = int(input())

def b(r, k):
    start = 1
    end = r
    cnt = 0
    middle = (start + end) // 2 # 할당
    while middle != k:
        if middle == k:
            cnt += 1
        elif middle >= k:
            end = middle-1
            cnt += 1
        else:
            start = middle+1
            cnt += 1
        middle = (start + end) // 2 # 재할당
        print(start, middle, end)
    return cnt + 1

for i in range(t):
    sump, pa, pb = map(int, input().split())
    result = 0
    # print(b(sump,pa), b(sump, pb))

    if b(sump, pa) < b(sump, pb):
        print(f'#{i+1} A')
    elif b(sump, pa) > b(sump, pb):
        print(f'#{i+1} B')
    else:
        print(f'#{i+1} 0')

'''
input
3
400 300 350
1000 299 578
1000 222 888

output
#1 A
#2 0
#3 A

'''