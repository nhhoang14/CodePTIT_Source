# https://code.ptit.edu.vn/student/question/PY02066
# BÀI TOÁN ĐẾM

n = int(input())
ds = []
while len(ds) < n:
    ds += list(map(int, input().split()))
res = []
en = max(ds)
for i in range(1, en):
    if i not in ds:
        res.append(i)
if res:
    print(*res, sep='\n')
else :
    print("Excellent!")