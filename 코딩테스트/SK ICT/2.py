def solution(n, clockwise):
    # 도착점 n 이 홀수일 때 (n//2, n//2)
    # 짝수 일때, (n//2, n//2) or (n//2-1, n//2-1)
    # i번 째줄 i 칸 남기고 진행


    answer = [[0] *n for _ in range(n)]
    # 방향 설정
    # 상 하 좌 우
    dc = [-1,1,0,0] # 행
    dl = [0,0,-1,1] # 열


        length = n*n //4
    x1,y1 = 0,0
    cnt1 = 0
    # dir1
    if n % 2 == 0:
        for i in range(1,length+1):
            answer[x1][y1] = i
            cnt += 1
            if cnt <=4:
                x1 += 1
            else:


    else:
        for i in range(1,length+2):
            pass
    # dir2
    for i in range(1,length+1):
        pass

    # dir3
    for i in range(1,length+1):
        pass

    # dir4
    for i in range(1,length+1):
        pass



    return answer

24 +1
print(solution(5, True)) # 7 =  n-1 n-3 n-4 4+ 2 +1
print(solution(6, False)) # 9 = 5+ 3 + 1
print(solution(9, False)) # 21 = 8+ 6 + 4 + 2 + 1

'''
answer

n	clockwise	result
5	True	    [[1,2,3,4,1],[4,5,6,5,2],[3,6,7,6,3],[2,5,6,5,4],[1,4,3,2,1]]
6	False	    [[1,5,4,3,2,1],[2,6,8,7,6,5],[3,7,9,9,8,4],[4,8,9,9,7,3],[5,6,7,8,6,2],[1,2,3,4,5,1]]
9	False	    [[1,8,7,6,5,4,3,2,1],[2,9,14,13,12,11,10,9,8],[3,10,15,18,17,16,15,14,7],[4,11,16,19,20,19,18,13,6],[5,12,17,20,21,20,17,12,5],[6,13,18,19,20,19,16,11,4],[7,14,15,16,17,18,15,10,3],[8,9,10,11,12,13,14,9,2],[1,2,3,4,5,6,7,8,1]]

'''