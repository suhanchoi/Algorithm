def solution(s, idx):
    answer = []
    st = []

    left = []

    lst = [False] * len(s)

    for i in range(len(s)):
        if s[i] == '{':
            st.append(s[i])
            left.append(i)

        if s[i] == '}':
            st.pop()
            index = left.pop()
            lst[i] = index
            lst[index] = i
    # print(lst)
    for i in idx:
        answer.append(lst[i])
    return answer


print(solution("{cpp{java}}{python}",[0, 4, 9, 10, 11, 18]))
print(solution("ab{}cd{efg{}h}{ij}",[3, 6, 11, 3, 14, 11]))
