# sorted(ary)는 정렬한 새로운 리스트 만들어서 반환
# ary.sort() 는 바꿔주기만 하고 반환 X

num = int(input())

ary = list(input() for _ in range(num))
ary = list(set(ary)) # set 으로 중복 제거
ary.sort(key = lambda word: (len(word), word)) # key , lambda 통해 글자 갯수, 글자 기준으로 정렬

for i in ary:
    print(i)
