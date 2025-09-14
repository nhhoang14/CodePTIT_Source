# https://code.ptit.edu.vn/student/question/PY02023
# SẮP XẾP THEO TỔNG CHỮ SỐ

def sumKt(n):
    total = 0
    while n > 0:
        total += n % 10
        n = n // 10
    return total

for _ in range(int(input())):
    n = int(input())
    res = list(map(int, input().split()))
    res.sort(key=lambda x: (sumKt(x), x))
    print(*res)
