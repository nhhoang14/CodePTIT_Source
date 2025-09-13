# https://code.ptit.edu.vn/student/question/PY01042
# KIỂM TRA HỆ CƠ SỐ 3

def check(s):
    for c in s:
        if c != '0' and c != '1' and c != '2':
            return False
    return True

for t in range(int(input())):
    s = input()
    if check(s):
        print("YES")
    else:
        print("NO")