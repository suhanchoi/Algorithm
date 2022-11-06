# stack 을 활용해서 풀이
t = int(input())

for t in range(t):

    string = input()

    result = 1

    st = [] # stack 생성

    for i in range(len(string)):
        if string[i] == '(':
            st.append(string[i])

        if string[i] == '{':
            st.append(string[i])

        if string[i] == ')':
            if st and st[-1] == '(':
                st.pop(-1)
            else:
                result = 0
                break

        if string[i] == '}':
            if st and st[-1] == '{':
                st.pop(-1)
            else:
                result = 0
                break
    if st:
        result = 0
    print(f'#{t+1} {result}')
