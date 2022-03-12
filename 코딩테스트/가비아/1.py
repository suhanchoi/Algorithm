def solution(mod1, mod2, max_range):

    if mod1 > mod2:
        max = mod1
        min = mod2
    else:
        max = mod2
        min = mod1

    for i in range(min, -1, -1):
        if min % i == 0 and max % i == 0:
            big = i # 최대공약수
            break

    small = max // big * min // big * big # 최소공배수

    a = max_range // mod1

    b = max_range // small

    answer = a - b

    return answer

print(solution(4,3,20))
print(solution(3,4,20))
