import sys

num = int(input())

def push(num):
    st.append(num)

def pop():
    if st:
        print(st[-1])
        st.pop(-1)
        return
    print(-1)

def size():
    print(len(st))

def empty():
    if st:
        print(0)
        return
    print(1)

def top():
    if st:
        print(st[-1])
        return
    print(-1)

st = []

for i in range(num):
    command = sys.stdin.readline().split() # 한 줄만 입력. 속도 향상 input -> sys.stdin.readline
    # print(command)

    if command[0] == 'push':
        push(int(command[1]))

    elif command[0] == 'pop':
        pop()

    elif command[0] == 'size':
        size()

    elif command[0] == 'empty':
        empty()

    else:
        top()
