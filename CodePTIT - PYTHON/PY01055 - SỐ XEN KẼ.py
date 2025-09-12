#https://code.ptit.edu.vn/student/question/PY01055
#SỐ XEN KẼ

def check(s):
    if len(s) % 2 == 0:
        return False
    if s[0] == s[1]:
        return False
    for i in range(0, len(s) - 2, 2):
        if s[i] != s[i + 2]:
            return False
    return True

for _ in range(int(input())):
    s = input()

    if check(s):
        print("YES")
    else:
        print("NO")