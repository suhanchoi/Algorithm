from sys import stdin

# def get_k(value):
#     for k,v in mydict.items():
#         if v == value:
#             return k

mydict = {}
idxdict = {} # 시간 초과 해결을 위한 역 참조 (값에서 -> 키 참조)

total_num , num = map(int, stdin.readline().split())

for i in range(total_num):
    inputstring = stdin.readline().strip()
    mydict[i+1]= inputstring
    idxdict[inputstring] = i+1

# vlst = list(mydict.values())

for i in range(num):
    t = stdin.readline().strip()
    if t.isalpha(): # 이름이 들어가면
        print(int(idxdict.get(t)))
        continue
    print(mydict.get(int(t))) # 숫자가 들어가면
