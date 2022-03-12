def solution(arr, k, t):
    global answer
    answer = 0

    N = len(arr)
    R = k
    c = [0] * k

    def nCr(n, r, s, k):  # n개에서 r개를 고르는 조합, s: 선택할 수 있는 구간의 시작 k 고른 개수
        global answer

        # temp = 0 # ???
        # for i in c:
        #     temp += arr[i]
        #     if temp >t:
        #         return

        temp = 0
        if k == r:
            for i in c:
                temp += arr[i]
                # print(arr[i], end=" ")
            if temp <= t:
                answer += 1
                # print()
        else:
            for i in range(s, n - r + k + 1):
                c[k] = i
                nCr(n, r, i + 1, k + 1)

    nCr(N, R, 0, 0)


    return answer

# print(solution([2,5,3,8,1],3,11))
# print(solution([1,1,2,2],2,3))
# print(solution([1,2,3,2],2,2))

'''
print(solution([2,5,3,8,1],3,11))

[2, 5, 3]
[2, 5, 1]
[5, 3, 1]
[2, 3, 1]
[2, 8, 1]
[2, 5, 3, 1]

'''