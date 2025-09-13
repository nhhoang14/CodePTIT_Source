# https://code.ptit.edu.vn/student/question/PY01020
# SỐ PHÁT LỘC

tc = int(input())
for _ in range(tc):
    s = input()
    length = len(s)
    if s[length - 1] == '6' and s[length - 2] == '8':
        print("YES")
    else:
        print("NO")