def cal(num): # 재귀
    if len(num) <= 1:
        print('yes')
        return
    if num[0] == num[-1]:
        cal(num[1:-1])
    else:
        print('no')

while (True):
    num = input()
    if num == '0':
        break
    cal(num)
