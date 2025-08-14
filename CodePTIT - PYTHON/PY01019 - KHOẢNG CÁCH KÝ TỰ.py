#https://code.ptit.edu.vn/student/question/PY01019
#KHOẢNG CÁCH KÝ TỰ

import math

def check(s):
    tmp = s[::-1]
    for i in range(len(s) - 1, -1, -1):
        if abs(ord(s[i]) - ord(s[i - 1])) != abs(ord(tmp[i]) - ord(tmp[i - 1])):
            return "NO"
    return "YES"

tc = int(input())
for _ in range(tc):
    s = input()
    print(check(s))