# https://code.ptit.edu.vn/student/question/PY02025
# TẬP HỢP SỐ NGUYÊN

n, m = map(int, input().split())
a = set(input().split())
b = set(input().split())

inter = sorted(a & b)
comp1 = sorted(a - b)
comp2 = sorted(b - a)
print(" ".join(inter))
print(" ".join(comp1))
print(" ".join(comp2))