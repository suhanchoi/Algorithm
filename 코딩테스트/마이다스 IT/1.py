

def solution(H):
    # 각 높이에 따른 index값
    indexs = {}
    for i in range(len(H)):
        if H[i] in indexs:
            indexs[H[i]].append(i)
        else:
            indexs[H[i]] = [i]
    print("indexs",indexs)

    set_height = sorted(list(set(H)))
    length = len(H)
    answer = [[i, 0] for i in set_height]

    for temp_list in answer:
        level = temp_list[0]
        for start_index in range(length): # core # 0 1 2 3 4
            for i in range(length - start_index): # 0 1 2 3 4 # 0 1 2 3
                end_index = start_index + i
                temp = H[start_index:end_index+1]

                min_temp = min(temp)
                if min_temp == level:
                    answer[level-1][1] += 1
    return answer


H = [3,2,1,1,3]

print("answer",solution(H))