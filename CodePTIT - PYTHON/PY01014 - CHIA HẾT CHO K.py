# https://code.ptit.edu.vn/student/question/PY01014
# CHIA HẾT CHO K

a, k, n = map(int, input().split())

st = (int(a / k) + 1) * k - a
en = int(n / k) * k - a
if st <= en:
    for i in range(st, en + 1, k):
        print(i, end = ' ')
else:
    print(-1)