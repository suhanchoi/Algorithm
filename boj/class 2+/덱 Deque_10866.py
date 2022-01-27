import sys

num = int(input())

def push_front(num):
    deq.insert(0, num)  # (index, value)

def push_back(num):
    deq.append(num)

def pop_back():
    if deq:
        print(deq[-1])
        deq.pop(-1)
        return
    print(-1)

def pop_front():
    if deq:
        print(deq[0])
        deq.pop(0)
        return
    print(-1)

def size():
    print(len(deq))

def empty():
    if deq:
        print(0)
        return
    print(1)

def back():
    if deq:
        print(deq[-1])
        return
    print(-1)

def front():
    if deq:
        print(deq[0])
        return
    print(-1)

deq = []

for i in range(num):
    command = sys.stdin.readline().split()  # 한 줄만 입력. 속도 향상 input -> sys.stdin.readline

    if command[0] == 'push_front':
        push_front(int(command[1]))

    if command[0] == 'push_back':
        push_back(int(command[1]))

    elif command[0] == 'pop_front':
        pop_front()

    elif command[0] == 'pop_back':
        pop_back()

    elif command[0] == 'size':
        size()

    elif command[0] == 'empty':
        empty()

    elif command[0] == 'front':
        front()

    elif command[0] == 'back':
        back()
