import sys, time
s_time = time.time()

num = int(sys.stdin.readline())
# num = int(input())

ary = []

for i in range(num):
    ary.append(int(sys.stdin.readline()))
    # ary.append(int(input()))

print(ary)

e_time = time.time()
print('time : ',e_time - s_time)