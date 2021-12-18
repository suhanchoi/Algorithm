num = int(input())

for t in range(num):
    mystr = input()

    st = [] # stack 활용

    result = True

    for i in range(len(mystr)):
        if mystr[i] == '(':
            st.append(mystr[i])

        if mystr[i] == ')':
            if st and st[-1] == '(': # stack 이 있고, 열린게 확인이 되면
                st.pop(-1) # 정상처리
            else:
                result = False
    if st:
        result = False

    if result:
        print('YES')
    else:
        print('NO')
