import sys

# ary 원소 참조후 stack 안에 있는지 확인하고 없으면 그 수까지 push +
# 있으면 그 수가 나올때까지 pop - stack 에서 나오는거 ary랑 비교후 안돼면 NO

def chk(ary):
    st = []
    result = []

    i = 0
    n = 1

    while True:
        while ary[i] not in st:
            st.append(n)
            result.append('+')
            n += 1

            if n > num+1:
                print('NO')
                return
        else:
            st.pop(-1)
            result.append('-')

        if i == num - 1:
            break

        i += 1

    for i in result:
        print(i)


num = int(sys.stdin.readline())

ary = []

for i in range(num):
    ary.append(int(sys.stdin.readline()))

chk(ary)






