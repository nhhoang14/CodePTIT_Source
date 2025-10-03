# https://code.ptit.edu.vn/student/question/PY01050
# KÝ TỰ A – B – C

def check(res):
    for j in range(2):
        if vs[j] > vs[j + 1]:
            return False
    return True

def Try(i, m, res):
    if i == m:
        if check(res) and all(vs): print(res)
        return
    for j in range(3):
        vs[j] += 1
        Try(i + 1, m, res + kt[j])
        vs[j] -= 1

n = int(input())
kt = ["A", "B", "C"]
vs = [0, 0, 0]
for length in range(3, n + 1):
    Try(0, length, "")