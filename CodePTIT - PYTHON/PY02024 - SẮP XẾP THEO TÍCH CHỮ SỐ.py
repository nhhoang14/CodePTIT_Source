# https://code.ptit.edu.vn/student/question/PY02024
# SẮP XẾP THEO TÍCH CHỮ SỐ

def mulKt(n):
    mul = 1
    while n > 0:
        mul *= n % 10
        n = n // 10
    return mul

for _ in range(int(input())):
    n = int(input())
    res = list(map(int, input().split()))
    res.sort(key=lambda x: (mulKt(x), x))
    print(*res)
