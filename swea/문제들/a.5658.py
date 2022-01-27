# 모의 SW 역량테스트 : 보물상자 비밀번호

# 강의 모법 답

def generate_num(pos):
    result = 0
    for i in range(pos, pos + edge_size):
        result = result * 16 + Digits[i]

    return result


def solve():
    b = []
    for i in range(len(nums)):
        b.append(generate_num(i))

    b = sorted(b, reverse=True)

    same_num_cnt = 0

    k = 1
    while k < K:
        if b[k] == b[k - 1]:
            same_num_cnt += 1
        k += 1

    return b[k - 1 + same_num_cnt]


for tc in range(1, int(input()) + 1):
    N, K = map(int, input().split())
    nums = list(map(str, input()))
    edge_size = len(nums) // 4
    Digits = []

    for i in range(len(nums)):
        if nums[i] < 'A':
            Digits.append(ord(nums[i]) - ord('0'))
        else:
            Digits.append(ord(nums[i]) - ord('A') + 10)

    for i in range(edge_size):
        Digits.append(Digits[i])

    print('#%d' % tc, solve())