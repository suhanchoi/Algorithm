def solution(money, costs):
    # money 는 생산해야하는 최소비용
    # costs 는 1 5 10 50 100 500 의 생산 단가
    answer = 0
    lst = []

    value = [1,5,10,50,100,500]
    value_dict = {i : value[i] / costs[i] for i in range(6)}
    scost = sorted(value_dict.items(),key=lambda x:x[1],reverse=True)
    print(scost)
    scost_list= list(scost)
    print("scost_list",scost_list)

    for i in range(6):
        lst.append([value[scost[i][0]], costs[scost[i][0]]])
    # 동전의 가치, 비용으로 새로 정렬
    print("lst",lst)

    for i in range(6):
        i_count = money // lst[i][0]
        money %= lst[i][0]
        answer = answer + i_count * lst[i][1] # 최소비용

        if money == 0:
            break

    return answer

print(solution(4578,[1, 4, 99, 35, 50, 1000]))
# # (solution(4578,[1, 4, 99, 35, 50, 1000]))
# print(solution(1999,[2, 11, 20, 100, 200, 600]))