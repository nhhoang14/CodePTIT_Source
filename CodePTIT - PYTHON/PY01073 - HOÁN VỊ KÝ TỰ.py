# https://code.ptit.edu.vn/student/question/PY01073
# HOÁN VỊ KÝ TỰ

def Try(res):
    global s, length
    if len(res) == length:
        print(res)
        return
    for i in range(length):
        if not vs[i]:
            vs[i] = True
            Try(res + s[i])
            vs[i] = False

s = input()
length = len(s)
vs = [False] * length
Try("")