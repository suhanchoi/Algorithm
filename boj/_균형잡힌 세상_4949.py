import sys

def chk(ary):
    st = []

    for i in range(len(ary)):
        if ary[i] == '(':
            st.append('(')

        elif ary[i] == '[':
            st.append('[')

        elif ary[i] == ')':
            if st and st[-1] == '(':
                st.pop(-1)
                continue
            print('no')
            return
        elif ary[i] == ']':
            if st and st[-1] == '[':
                st.pop(-1)
                continue
            print('no')
            return

    if st:
        print('no')
        return
    print('yes')


while True:
    ary = sys.stdin.readline()

    if ary[0] =='.':
        break

    chk(ary)
    ary = ''
