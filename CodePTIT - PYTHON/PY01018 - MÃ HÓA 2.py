#https://code.ptit.edu.vn/student/question/PY01018
#MÃ HÓA 2

P = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ_.'

while True:
    line = input().split()
    k = int(line[0])
    if k == 0:
        break
    s = line[1]
    res = ''
    for c in s:
        res += P[(P.index(c) + k) % 28]
    print(res[::-1])