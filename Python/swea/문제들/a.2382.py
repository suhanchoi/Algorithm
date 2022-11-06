# 모의 SW 역량테스트 : 미생물 격리

# 강의 모법 답

POS_X = 0
POS_Y = 1
COUNT = 2
DIRECTION = 3
UP = 1
DOWN = 2
LEFT = 3
RIGHT = 4

# 무 상 하 좌 우
dy = [0, -1, 1, 0, 0]
dx = [0, 0, 0, -1, 1]
reverse_direction = [0, DOWN, UP, RIGHT, LEFT]  # 방향 전환


def move():
    microbe_check = {}  # 이동 후 미생물 겹침을 제어
    #    i_th = -1           # 미생물 리스트의 i번째 미생물 관리

    #    for microbe in microbes_list :
    for i_th in range(K):
        microbe = microbes_list[i_th]
        y, x, cur_cnt, direction = microbe
        # i_th += 1

        if cur_cnt == 0:
            continue  # 다음 미생물

        # 이동
        new_y, new_x = y + dy[direction], x + dx[direction]
        microbe[POS_X], microbe[POS_Y] = new_y, new_x
        # 강의 중 수정 microbe[POS_Y], microbe[POS_X] = new_y, new_x

        # 약품으로 이동 시 반감 후 방향 전환
        if new_y == 0 or new_y == N - 1 or new_x == 0 or new_x == N - 1:
            microbe[COUNT] //= 2
            microbe[DIRECTION] = reverse_direction[microbe[DIRECTION]]
            continue

        # 좌표에 아무것도 없으면
        if (new_y, new_x) not in microbe_check:
            microbe_check[(new_y, new_x)] = (i_th, cur_cnt)  # 미생물 등록
            continue

        # 좌표에 있으면(겹침)
        prev_max_th, prev_max_cnt = microbe_check[(new_y, new_x)]

        if prev_max_cnt < cur_cnt:  # 보다 크면
            microbe_check[(new_y, new_x)] = (i_th, cur_cnt)  # 등록
            microbe[COUNT] += microbes_list[prev_max_th][COUNT]  # 흡수
            microbes_list[prev_max_th][COUNT] = 0
        else:  # 작으면
            microbes_list[prev_max_th][COUNT] += microbe[COUNT]  # 흡수 당함
            microbe[COUNT] = 0


for tc in range(1, 1 + int(input())):
    N, M, K = map(int, input().split())
    microbes_list = [list(map(int, input().split())) for _ in range(K)]

    for _ in range(M):
        move()

    result = sum(map(lambda microbe: microbe[COUNT], microbes_list))
    print('#%d' % tc, result)

