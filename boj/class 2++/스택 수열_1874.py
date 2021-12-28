# import sys

# ary 원소 참조후 stack 안에 있는지 확인하고 없으면 그 수까지 push +
# 있으면 그 수가 나올때까지 pop - stack 에서 나오는거 ary랑 비교후 안돼면 NO

''' 
def chk(ary): # 시간초과
    st = []
    result = []

    n = 1
    for i in range(num):
        while ary[i] not in st:
            if n <= ary[i]:
                st.append(n)
                result.append('+')
                n += 1
            else:
                print('NO')
                return

        if ary[i] in st:
            st.pop()
            result.append('-')

        if st and st[-1] > ary[i]:
            print('NO')
            return

    for j in (result):
        print(j)
'''

import sys

num = int(sys.stdin.readline())

ary = [0]*num

st = []
result = []
cnt = 0

for i in range(num):
    x = int(sys.stdin.readline())

    while cnt < x:
        cnt += 1
        st.append(cnt)
        result.append('+')

    if st[-1] == x:
        st.pop()
        result.append('-')

    else:
        print('NO')
        break

else: # break 안 됐을때 실행
    for i in result:
        print(i)

# chk(ary) # 시간초과

