ary = list(map(int, input().split()))
sum = 0

minx = 1000
miny = 1000

x1 = abs(ary[0]-ary[2])
y1 = abs(ary[0]-ary[2])



if minx > miny:
    print(miny)
else:
    print(minx)
