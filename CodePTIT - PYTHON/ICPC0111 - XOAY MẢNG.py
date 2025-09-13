# https://code.ptit.edu.vn/student/question/ICPC0111
# XOAY MẢNG

for _ in range(int(input())):
    n, d = map(int, input().split())
    lst = input().split()
    print(*(lst[d:] + lst[:d]))