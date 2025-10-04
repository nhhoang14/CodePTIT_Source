# https://code.ptit.edu.vn/student/question/PYKT073
# XÁC ĐỊNH THỂ LOẠI THƠ

res = []
prev = cnt = 0
for _ in range(int(input())):
    s = input().split()
    tmp = len(s)
    if tmp == 7: cnt += 1
    if tmp == 6 and (prev == 7 or prev == 0):
        res.append(1)
    elif tmp == 7 and (prev == 8 or prev == 0 or cnt == 4):
        res.append(2)
        cnt = 0
    prev = tmp
print(len(res))
print(*res, sep='\n')