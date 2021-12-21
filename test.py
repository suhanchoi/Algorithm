import sys
num = int(sys.stdin.readline())

for i in range(num):
    a,b = sys.stdin.readline().split()
    temp = int(a)+int(b)
    print(temp)