#https://code.ptit.edu.vn/student/question/PY02002
#LIỆT KÊ SỐ FIBONACCI

def fibo_in_range(a, b):
    x, y = 1, 1
    cnt = 1
    while cnt <= b:
        if cnt >= a:
            print(x, end=" ")
        x, y = y, x + y
        cnt += 1

for _ in range(int(input())):
    a, b = map(int, input().split())
    fibo_in_range(a, b)
    print()