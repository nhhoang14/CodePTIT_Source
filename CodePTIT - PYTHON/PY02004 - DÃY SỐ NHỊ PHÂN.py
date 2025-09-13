# https://code.ptit.edu.vn/student/question/PY02004
# DÃY SỐ NHỊ PHÂN

n = int(input())
lst = list(map(int, input().split()))[:n]
cnt = 0
for i in range(n - 1):
    if lst[i] != lst[i + 1]:
        cnt += 1
print(cnt)