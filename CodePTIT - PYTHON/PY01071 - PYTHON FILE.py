# https://code.ptit.edu.vn/student/question/PY01071
# PYTHON FILE

def check(s):
    pos = 0
    for i in range(len(s)):
        if s[i] == ".":
            pos = i + 1
            break
        elif not s[i].isalpha():
            return False
    tmp = s[pos:]
    return len(tmp) == 2

s = input()
if(check(s)):
    print("yes")
else:
    print("no")
