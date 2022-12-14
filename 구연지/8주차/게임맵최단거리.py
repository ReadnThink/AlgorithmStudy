"""
map은 100X100 -> 최악의 경우는 200번째까지 갈 수 있음 -> iter의 최댓값을 m+n으로
지난번에 했던 것처럼 최단거리를 가지는 array를 만들기?

(1) 런타임 에러, 제대로 풀리지 X: np.where가 속도가 매우 느림 -> 다른 방법이 없을까?

(2) 계속 도중에 끊어지는 문제: 아닌 조건일 때 continue를 해주지 않으면 if 가 성립하지 않는 경우 끊어짐

(3) 같은 distance를 가져야 함에도 코드 상에서 뒤늦게 방문하면 distance가 더 멀어짐 -> distance를 가지고 iter를 돌기

(4) distance를 가지고 도는 경우는 처음 distance를 2로 설정해줄 필요가 없음!

"""





import queue as q


def solution(maps):

    distances = calculate_distance(maps, 0, 0)
    x_length = len(distances)
    y_length = len(distances[0])
    # print(distances)

    if distances[x_length-1][y_length-1] == 1:

        return -1
    else:
        return distances[x_length-1][y_length-1]



def calculate_distance(arr, x, y):

    # np.where 부분을 큐로 대체함

    queue = q.Queue()
    distance = 1
    queue.put((x, y, distance)) # 좌표를 넣음


    arr[x][y] = distance

    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]


    while queue.empty() == False:
        x, y, distance = queue.get()

        # print(distance)
        # distance가 같은 깊이임에도 달라지는 문제가 발생 -> distance를 가지고 돌기
        for i in range(len(dx)):

            xs = x + dx[i]
            ys = y + dy[i]

            # 아닌 조건일 때 continue를 해주지 않으면 if 가 성립하지 않는 경우 끊어짐
            if xs<0 or xs>=len(arr) or ys<0 or ys>=len(arr[0]) or arr[xs][ys]>1:
                continue
            if arr[xs][ys] == 0:
                continue

            if arr[xs][ys] == 1:
                arr[xs][ys] = distance+1
                # 다음 부터는 정상적으로
                queue.put((xs, ys, distance+1))

            # continue를 해주지 않으면 중단 됨




    return arr


print(solution([[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]))

print(solution([[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]))
