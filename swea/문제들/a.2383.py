# 모의 SW 역량테스트 : 점심 식사시간
# 부분집합, 완전검색

# 강의 모범 답

def donw_stairs(entrance, arrival_times):
    if not arrival_times: return 0

    arrival_times.sort()
    people_in_stair_by_time = [0] * 200  # 시간별로 계단을 통과하는 사람 수 기록

    K = Spos[entrance][2]  # 계단에 머무는 시간
    for t in arrival_times:
        tt = t + 1
        while people_in_stair_by_time[tt] >= 3: tt += 1
        for j in range(tt, tt + K):
            people_in_stair_by_time[j] += 1

    for i in range(199, 0, -1):
        if people_in_stair_by_time[i]: return i + 1


def move(entrance_choices, ppos_cnt):
    arrival0 = []
    arrival1 = []

    for i in range(ppos_cnt):  # i번 사람이 어느 계단으로 갈지 결정
        if entrance_choices & (1 << i) == 0:  # 0번 계단으로 가는 경우
            arrival0.append(dist[i][0])  # 0번 계단에 도착하는 시간
        else:
            arrival1.append(dist[i][1])  # 1번 계단에 도착하는 시간

    return max(donw_stairs(0, arrival0), donw_stairs(1, arrival1))


for tc in range(1, int(input()) + 1):
    N = int(input())
    m = [list(map(int, input().split())) for _ in range(N)]
    Ppos = []
    Spos = []
    for i in range(N):
        for j in range(N):
            if m[i][j] == 1:
                Ppos.append([i, j])
            elif m[i][j] != 0:
                Spos.append([i, j, m[i][j]])

    dist = [[0] * 2 for i in range(len(Ppos))]
    for i in range(len(Ppos)):
        dist[i][0] = abs(Ppos[i][0] - Spos[0][0]) + abs(Ppos[i][1] - Spos[0][1])  # 사람i -> 계단0
        dist[i][1] = abs(Ppos[i][0] - Spos[1][0]) + abs(Ppos[i][1] - Spos[1][1])  # 사람i -> 계단1

    ans = 10e9
    for entrance_choices in range(1 << len(Ppos)):  # 사람이 간 계단을 비트로 표시
        ans = min(ans, move(entrance_choices, len(Ppos)))

    print('#%d' % tc, ans)