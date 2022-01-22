from sys import stdin

# def get_k(value):
#     for k,v in mydict.items():
#         if v == value:
#             return k

mydict = {}

total_num , num = map(int, stdin.readline().split())

for i in range(total_num):
    mydict[i+1]= stdin.readline().strip()

vlst = list(mydict.values())

for i in range(num):
    t = stdin.readline().strip()
    if t.isalpha():
        # print(get_k(t))
        print(int(vlst.index(t))+1)
        continue
    print(mydict.get(int(t)))