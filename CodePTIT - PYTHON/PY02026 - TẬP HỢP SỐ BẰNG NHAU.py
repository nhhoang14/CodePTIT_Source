# https://code.ptit.edu.vn/student/question/PY02026
# TẬP HỢP SỐ BẰNG NHAU

n, m = map(int, input().split())
a = sorted(set(input().split()))
b = sorted(set(input().split()))
if a == b:
    print("YES")
else:
    print("NO")