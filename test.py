import sys
# num = int(sys.stdin.readline())

def chk(n):
    cnt = 0
    while n//10 > 0:
        cnt += 1
        n /= 10
    return cnt

print(chk(552))