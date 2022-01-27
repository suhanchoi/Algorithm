import sys

def fibo(num):
    if num < 2:
        return num
    return fibo(num-2) + fibo(num-1)

num = int(sys.stdin.readline())
print(fibo(num))