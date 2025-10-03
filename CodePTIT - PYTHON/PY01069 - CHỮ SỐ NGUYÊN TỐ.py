# https://code.ptit.edu.vn/student/question/PY01069
# CHỮ SỐ NGUYÊN TỐ

def Try(i, m, res):
    if i == m:
        if all(v > 0 for v in vs):
            print(res)
        return
    for j in range(4):
        if i == m - 1 and j == 0: continue
        vs[j] += 1
        Try(i + 1, m, res + str(prime[j]))
        vs[j] -= 1

n = int(input())
prime = [2, 3, 5, 7]
vs = [0, 0, 0, 0]
for length in range(4, n + 1):
    Try(0, length, "")