import sys

num = int(sys.stdin.readline())

st = []

for i in range(num):
    n = (int(sys.stdin.readline()))
    if n == 0:
        st.pop(-1)
    else:
        st.append(n)

print(sum(st))


