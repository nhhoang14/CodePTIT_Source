# https://code.ptit.edu.vn/student/question/PYKT078
# SẮP XẾP DÃY SỐ

for _ in range(int(input())):
    n, m = map(int, input().split())
    lst = list(map(int, input().split()))
    max_val = max(lst)
    id = lst.index(max_val)
    lst.insert(id, m)

    neg = [x for x in lst if x < 0]
    pos = [x for x in lst if x >= 0]
    res = neg + pos

    print(*res)
