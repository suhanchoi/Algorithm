num = int(input())


ary = list(input() for _ in range(num))
print(ary)

newary = ary
newary.sort()
print(newary)