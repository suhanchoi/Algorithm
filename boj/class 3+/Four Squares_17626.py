from sys import stdin

# 버림은 int # 최대가 4 # 브루트포스 # is_integer

def chk(n):

    if n - (int(n**(1/2)))**2 == 0:
        return 1

    for i in range(1, int(n**(1/2))+1):
        if ((n-i*i)**(1/2)).is_integer():
            return 2

    for i in range(1, int(n**(1/2))+1):
        for j in range(1, int((n-i*i)**(1/2))+1):
            if ((n-i*i-j*j)**(1/2)).is_integer():
                return 3
    return 4

num = int(stdin.readline())

print(chk(num))

