#https://code.ptit.edu.vn/student/question/PY01029
#SỐ ĐẢO NGUYÊN TỐ CÙNG NHAU

import math

def check(s):
    tmp = s[::-1]
    if(math.gcd(int(tmp), int(s)) == 1):
        return "YES"
    return "NO"

tc = int(input())
for _ in range(tc):
    s = input()
    print(check(s))