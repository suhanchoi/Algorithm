## 컴퓨터 파일로 관리해서 git 으로 합치기

# 211015
# tree practice

# 추가 부분
par = [0] * (V+1) # 자식을 인덱스로 부모 번호 저장
for i in range(E):
    if :
    else:

    par[c] = p # 각 인덱스에 맞는 조상을 저장
                # 조상을 찾는데 사용
                # root 찾기

c = 6 # 궁금한 정점
while par[c]: # 조상이 있다면 True
    print(par[c])
    c = par[c] # 자식 초기화
# 6의 조상 3 1 을 출력

# 부모가 없으면 root
root = 1
while par[root]: # -> != 0 #  root 로 추정한 정점이 부모가 있으면
    root += 1
print(root)

