# https://code.ptit.edu.vn/student/question/PY01066
# XÂU “THĂNG BẰNG”

def check(s):
    slen = len(s)
    for i in range(slen // 2):
        if abs(ord(s[i]) - ord(s[i + 1])) != abs(ord(s[slen - 1 - i]) - ord(s[slen - 2 - i])):
            return False
    return True


for _ in range(int(input())):
    s = input().strip()
    if check(s):
        print("YES")
    else:
        print("NO")