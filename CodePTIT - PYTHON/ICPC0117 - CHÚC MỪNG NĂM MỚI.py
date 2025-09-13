# https://code.ptit.edu.vn/student/question/ICPC0117
# CHÚC MỪNG NĂM MỚI

n = int(input())
res = []
for _ in range(n):
    s = input()
    if s not in res:
        res.append(s)
print(len(res))
