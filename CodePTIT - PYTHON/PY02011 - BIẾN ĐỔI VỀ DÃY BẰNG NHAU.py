# https://code.ptit.edu.vn/student/question/PY02011
# BIẾN ĐỔI VỀ DÃY BẰNG NHAU

n = int(input())
a = list(map(int, input().split()))
res = 10**9
last = a[0]
for i in range(n):
    sum = 0
    for j in range(n):
        sum += abs(a[i] - a[j])
    if sum < res:
        res = sum
        last = a[i]
print(res, last)