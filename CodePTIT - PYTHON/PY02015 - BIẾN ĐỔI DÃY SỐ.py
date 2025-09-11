# https://code.ptit.edu.vn/student/question/PY02015
# BIẾN ĐỔI DÃY SỐ

while True:
    lst = list(map(int, input().split()))[:4]
    if all(x == 0 for x in lst):
        break

    cnt = 0
    while len(set(lst)) != 1:
        new_lst = [0]*4
        for i in range(4):
            new_lst[i] = abs(lst[i] - lst[(i+1) % 4])
        lst = new_lst
        cnt += 1

    print(cnt)
