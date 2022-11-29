
# map은 100X100 -> 최악의 경우는 200번째까지 갈 수 있음 -> iter의 최댓값을 m+n으로

# 지난번에 했던 것처럼 최단거리를 가지는 array를 만들기? -> 런타임 에러, 제대로 풀리지 X

import queue as q


def solution(maps):

    distances = calculate_distance(maps, 0, 0)
    x_length = len(distances)
    y_length = len(distances[0])
    print(distances)

    if distances[x_length-1][y_length-1] == 1:

        return -1
    else:
        return distances[x_length-1][y_length-1]



def calculate_distance(arr, x, y):

    # np.where 부분을 큐로 대체함

    queue = q.Queue()
    queue.put((x,y)) # 좌표를 넣음

    distance = 2
    arr[x][y] = distance
    # 처음 값을 2로 지정해주어서 다시 돌아오지 않도록 함

    dx = [-1,1,0,0]
    dy = [0,0,-1,1]


    while queue.empty() == False:
        (x, y) = queue.get()
        for i in range(len(dx)):

            xs = x + dx[i]
            ys = y + dy[i]

            # 아닌 조건일 때 continue를 해주지 않으면 if 가 성립하지 않는 경우 끊어짐
            if xs<0 or xs>=len(arr) or ys<0 and ys>=len(arr[0]):
                continue
            if arr[xs][ys] == 0:
                continue

            if arr[xs][ys] == 1:
                arr[xs][ys] = distance
                # 다음 부터는 정상적으로
                queue.put((xs,ys))

            # continue를 해주지 않으면 중단 됨

        distance += 1

    return arr


print(solution([[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]))

print(solution([[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]))
