# https://code.ptit.edu.vn/student/question/PY01027
# SỐ LỘC PHÁT ĐẸP

def check(s):
    cnt = 0
    for c in s:
        if c != '8' and c != '6':
            return "NO"
        if c == '8':
            cnt += 1
            if cnt == 3:
                return "NO"
        else:
            cnt = 0
    return "YES"


s = input()
print(check(s))
