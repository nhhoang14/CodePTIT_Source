# https://code.ptit.edu.vn/student/question/PY01015
# SỐ KHÔNG GIẢM

def check(s):
    length = len(s)
    for i in range(length - 1):
        if s[i] > s[i + 1]:
            print("NO")
            return
    print("YES")

tc = int(input())
for _ in range(tc):
    s = input()
    check(s)