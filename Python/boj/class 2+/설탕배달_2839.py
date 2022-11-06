# 설탕배달
# 3kg, 5kg 봉지
# re

def cal(num):
    fkg = 0
    tkg = 0

    if num % 5 == 0:
        print(num // 5)

    else:
        max5 = num // 5 + 1
        max3 = num // 3 + 1
        for i in range(max5, -1, -1):
            fkg = i
            for j in range(max3, -1, -1):
                tkg = j
                if fkg * 5 + tkg * 3 == num:
                    print(fkg + tkg)
                    return
                if i == 0:
                    if num % 3 == 0:
                        print(num // 3)
                        return
                    else:
                        print(-1)
                        return

num = int(input())
cal(num)




