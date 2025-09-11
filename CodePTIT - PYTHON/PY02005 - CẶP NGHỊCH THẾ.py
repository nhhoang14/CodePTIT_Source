#https://code.ptit.edu.vn/student/question/PY02005
#CẶP NGHỊCH THẾ

n = int(input())
lst = list(map(int, input().split()))[:n]
cnt = 0
for i in range(n - 1):
    for j in range(i + 1, n):
        if lst[i] > lst[j]:
            cnt += 1
print(cnt)