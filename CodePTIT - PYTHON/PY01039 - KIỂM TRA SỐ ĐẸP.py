#https://code.ptit.edu.vn/student/question/PY01039
#KIỂM TRA SỐ ĐẸP

def check(s):
    a = s[0]
    b = s[1]
    if a == b:
        return "NO"
    for i in range(2, len(s)):
        if i % 2 == 0 and s[i] != a:
            return "NO"
        if i % 2 == 1 and s[i] != b:
            return "NO"
    return "YES"

tc = int(input())
for _ in range(tc):
    s = input()
    print(check(s))