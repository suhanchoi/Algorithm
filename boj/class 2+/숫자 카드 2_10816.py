import sys
from collections import Counter

n = int(sys.stdin.readline())
nary = list(map(int,sys.stdin.readline().split()))

m = int(sys.stdin.readline())
mary = list(map(int,sys.stdin.readline().split()))

# for i in range(m):
#     n = nary.count(mary[i])
#     print(n,end=' ')
#     for j in range(n):
#         nary.remove(mary[i])
# print(nary)

n_count = {} # dict 으로 선언하고

for n in nary:
    if n in n_count: # 있는지 확인 후,
        n_count[n] +=1 # n 은 키, value 는 갯수
    else:
        n_count[n] = 1

# 위 과정은 collections Counter로 똑같이 구현이 가능

for m in mary:
    if m in n_count: # m이 키에 있는지 확인
        print(n_count[m],end=' ')
    else:
        print(0,end=' ')

# my_Counter = Counter(nary)
# print(my_Counter) # -> Counter({10: 3, 3: 2, -10: 2, 6: 1, 2: 1, 7: 1})
