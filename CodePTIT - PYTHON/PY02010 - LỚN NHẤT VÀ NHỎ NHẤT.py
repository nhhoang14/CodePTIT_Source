# https://code.ptit.edu.vn/student/question/PY02010
# LỚN NHẤT VÀ NHỎ NHẤT

while True:
    n = int(input())
    if n == 0:
        break
    arr = []
    for _ in range(n):
        arr.append(int(input()))
    a = min(arr)
    b = max(arr)
    if a == b:
        print("BANG NHAU")
    else: 
        print(a, b)