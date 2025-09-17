# https://code.ptit.edu.vn/student/question/PYKT079
# ĐIỀN SỐ

for _ in range(int(input())):
    n = int(input())
    lst = list(map(int, input().split()))
    lst.sort()
    res = []
    for i in range(len(lst) - 1):
        if lst[i + 1] - lst[i] > 1:
            res.extend(range(lst[i] + 1, lst[i + 1]))
    print(len(res))
