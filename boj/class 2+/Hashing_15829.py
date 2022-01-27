num = int(input())
word = input()

sum = 0
for i in range(num):
    sum += (ord(word[i])-96) * (31 ** i)
print(int(sum) % 1234567891)