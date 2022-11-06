# stack 활용
# ( 이면 stack 에 넣고 ) 이면 결과에 +

t = int(input())

for t in range(t):
    st = []
    target = input()
    result = 0
    for i in range(len(target)):
        if target[i] == '(':
            st.append('(')
        elif target[i] == ')' and target[i-1] == '(':
            st.pop(-1)
            result += len(st)
        elif target[i] == ')' and target[i-1] == ')':
            result += 1
            st.pop(-1)

    print(f'#{t+1} {result}')
