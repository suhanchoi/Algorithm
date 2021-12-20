def backtrack(a, k, input):
    global MaxCandidates
    c = [0] * MaxCandidates

    if k == input:
        # process_solution(a, k)  # 답이면 원하는 작업
        for i in range(1, k + 1):
            print(a[i], end=' ')
        print()

    else:
        k += 1
        ncandidates = construct_candidate(a, k, input, c)
        for i in range(ncandidates):
            a[k] = c[i]
            backtrack(a, k, input)


def ex_construct_candidate(a, k, input, c):
    c[0] = True
    c[1] = False
    return 2


def construct_candidate(a, k, input, c):
    in_perm = [False] * NMax

    for i in range(1, k):
        in_perm[a[i]] = True

    ncandidates = 0
    for i in range(1, input + 1):
        if in_perm[i] == False:
            c[ncandidates] = i
            ncandidates += 1
        return ncandidates


MaxCandidates = 100
NMax = 100
a = [0] * NMax
backtrack(a, 0, 3)
