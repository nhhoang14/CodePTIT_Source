# https://code.ptit.edu.vn/student/question/PY02017
# TÂN SUẤT LẺ

for _ in range(int(input())):
    n = int(input())
    lst = list(map(int, input().split()))
    dict = {}
    for num in lst:
        if num not in dict:
            dict[num] = 1
        else:
            dict[num] += 1
    for num in dict:
        if dict[num] % 2 == 1:
            print(num)
            break
