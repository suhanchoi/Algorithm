ary = list(map(int, input().split()))
asc = []
des = []
for i in range(8):
    asc.append(i+1)
    des.append(8-i)

if ary == asc:
    print('ascending')
elif ary == des:
    print('descending')
else:
    print('mixed')