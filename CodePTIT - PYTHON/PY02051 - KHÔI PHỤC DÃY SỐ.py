# https://code.ptit.edu.vn/student/question/PY02051
# KHÔI PHỤC DÃY SỐ

n = int(input())
ds = []
total = 0
for i in range(n):
    s = sum(map(int, input().split()))
    ds.append(s)
    total += s
total = total // ((n - 1) * 2)
for i in range(n):
    if n > 2:
        res = (ds[i] - total) // (n - 2)
    else:
        res = 1
    print(res, end=' ')