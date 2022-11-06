def check(str):
    st = []
    for i in range(len(str)):
        st.append(str[i])
        if len(st)>1 and st[-1] == st[-2]:
            st.pop(-1)
            st.pop(-1)
    return st

for t in range(10): # 10번 반복
    num, target = input().split()
    result = check(target)
    print(f'#{t+1} ',end='')
    for i in result:
        print(i,end='')
    print()

