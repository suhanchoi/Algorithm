# 누적 합 문제
def solution(estimates, k):
    answer = 0
    result = [0]

    for i in range (len(estimates)):
        result.append(result[-1]+ estimates[i])

    for i in range(k, len(estimates)+1):
        temp = result[i] - result[i - k]
        if answer < temp:
            answer = temp
            print("i",i)
    print(result)
    return answer


print(solution([5, 1, 9, 8, 10, 5],3))
print(solution([10, 1, 10, 1, 1, 4, 3, 10],6))

# 효율성 테스트
# 출력 크키 초과
