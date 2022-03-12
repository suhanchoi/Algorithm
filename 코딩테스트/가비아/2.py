def solution(p):
    answer = 0

    for i in range(len(p)):
        if p[i] == "<":
            answer += 1
            continue
        break
    for i in range(len(p)-1,-1,-1):
        if p[i] == ">":
            answer += 1
            continue
        break
    return answer

print(solution("<<<><"))