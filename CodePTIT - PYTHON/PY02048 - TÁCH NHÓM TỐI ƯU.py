# https://code.ptit.edu.vn/student/question/PY02048
# TÁCH NHÓM TỐI ƯU

n, k = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
cnt = 1
for i in range(1, n):
    if a[i] - a[i - 1] > k:
        cnt += 1
print(cnt)