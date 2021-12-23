import sys

num = int(sys.stdin.readline())

ary = []

for i in range(num):
    ary.append(int(sys.stdin.readline()))

print(ary)

# ary 원소 참조후 stack 안에 있는지 확인하고 없으면 그 수까지 push +
# 있으면 그 수가 나올때까지 pop - stack 에서 나오는거 ary랑 비교후 안돼면 NO