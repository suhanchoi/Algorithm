import sys

num = int(input())

def push(num):
    q.append(num)

def pop():
    if q:
        print(q[0])
        q.pop(0)
        return
    print(-1)

def size():
    print(len(q))

def empty():
    if q:
        print(0)
        return
    print(1)

def front():
    if q:
        print(q[0])
        return
    print(-1)

def back():
    if q:
        print(q[-1])
        return
    print(-1)

q = []

for i in range(num):
    command = sys.stdin.readline().split() # 한 줄만 입력. 속도 향상 input -> sys.stdin.readline

    if command[0] == 'push':
        push(int(command[1]))

    elif command[0] == 'pop':
        pop()

    elif command[0] == 'size':
        size()

    elif command[0] == 'empty':
        empty()

    elif command[0] == 'front':
        front()

    elif command[0] == 'back':
        back()
