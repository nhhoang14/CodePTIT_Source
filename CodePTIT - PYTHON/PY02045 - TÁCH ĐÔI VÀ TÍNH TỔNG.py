# https://code.ptit.edu.vn/student/question/PY02045
# TÁCH ĐÔI VÀ TÍNH TỔNG

s = input()
while len(s) > 1:
    mid = len(s) // 2
    t1 = int(s[:mid])
    t2 = int(s[mid:])
    s = str(t1 + t2)
    print(s)