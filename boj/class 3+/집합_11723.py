import sys

def add(x):
    if not myFind(x): # 없으면
        s.append(x)

def check(x):
    if myFind(x):  # 있으면
        print(1)
        return
    print(0)

def remove(x):
    if myFind(x):  # 있으면
        s.remove(x)

def toggle(x):
    if myFind(x):  # 있으면
        remove(x)
        return
    add(x)

def all():
    global s
    s = list(range(1,21))

def empty():
    global s
    s = []

def myFind(x): # 있으면 T 없으면 F
    return x in s # T or F

num = int(sys.stdin.readline())

s = []

for i in range(num):
    command = sys.stdin.readline().split()

    if command[0] == 'add':
        add(int(command[1]))

    elif command[0] == 'check':
        check(int(command[1]))

    elif command[0] == 'remove':
        remove(int(command[1]))

    elif command[0] == 'toggle':
        toggle(int(command[1]))

    elif command[0] == 'all':
        all()

    elif command[0] == 'empty':
        empty()