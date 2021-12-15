def push(item):
    s.append(item)

def pop():
    if len(s) == 0:
        print('Stack is Empty!') # underflow
        return
    else:
        return s.pop(-1)

s = []

push(1)
push(2)
push(3)

print('pop item -> ',pop())
print('pop item -> ',pop())
print('pop item -> ',pop())