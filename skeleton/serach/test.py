def reversechk(str):
    for i in range(len(str)):
        if str[i] != str[len(str) - 1 - i]:
            break
        if i == len(str) // 2:
            return True
    return False

a = input()
print(reversechk(a))