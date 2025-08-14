#https://code.ptit.edu.vn/student/question/PY01036
#TÍNH TỔNG PHÂN THỨC

tc = int(input())
for _ in range(tc):
    n = int(input())
    if n % 2 == 0:
        res = sum(1/int(i) for i in range(2, n + 1, 2))
    else:
        res = sum(1/int(i) for i in range(1, n + 1, 2))
    print("{:.6f}".format(res))