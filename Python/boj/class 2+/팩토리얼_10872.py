import sys

def fact(num):
    if num <2:
        return 1
    return num * fact(num-1)

num = int(sys.stdin.readline())

print(fact(num))
