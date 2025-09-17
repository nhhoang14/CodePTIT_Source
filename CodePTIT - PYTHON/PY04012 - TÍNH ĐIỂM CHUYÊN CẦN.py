# https://code.ptit.edu.vn/student/question/PY04012
# TÍNH ĐIỂM CHUYÊN CẦN

class SinhVien:
    def __init__(self, msv, name, lop):
        self.msv = msv
        self.name = name
        self.lop = lop
        self.cc = ""

    def __str__(self):
        return f'{self.msv} {self.name} {self.lop} {self.cc}'


n = int(input())
lstSV = []
dictSV = {}
for _ in range(n):
    msv = input()
    name = input()
    lop = input()
    sv = SinhVien(msv, name, lop)
    lstSV.append(sv)
    dictSV[msv] = sv

for _ in range(n):
    msv, s = input().split()
    total = 10
    for c in s:
        if c == 'v':
            total -= 2
        elif c == 'm':
            total -= 1
    res = str(total) if total > 0 else "0 KDDK"
    dictSV[msv].cc = res
print(*lstSV, sep="\n")
