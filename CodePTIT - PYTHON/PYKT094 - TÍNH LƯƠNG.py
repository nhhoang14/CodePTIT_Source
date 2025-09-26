# https://code.ptit.edu.vn/student/question/PYKT094
# TÍNH LƯƠNG

class NhanVien:
    def __init__(self, id, name, pb, ipd, day):
        self.id = id
        self.name = name
        self.pb = pb
        self.ipd = ipd
        self.day = day

    def getMul(self):
        hs = {
            "A": [10, 12, 14, 20],
            "B": [10, 11, 13, 16],
            "C": [9, 10, 12, 14],
            "D": [8, 9, 11, 13],
        }

        y = int(self.id[1:3])
        if 1 <= y <= 3:
            return hs[self.id[0]][0]
        elif 4 <= y <= 8:
            return hs[self.id[0]][1]
        elif 9 <= y <= 15:
            return hs[self.id[0]][2]
        else:
            return hs[self.id[0]][3]

    def getTotal(self):
        return self.ipd * self.day * self.getMul() * 1000

    def __str__(self):
        return f'{self.id} {self.name} {self.pb} {self.getTotal()}'


ds = {}
for _ in range(int(input())):
    s = input()
    ds[s[:2]] = s[3:]
for _ in range(int(input())):
    code = input()
    name = input()
    ipd = int(input())
    day = int(input())
    pb = ds[code[3:]]
    print(NhanVien(code, name, pb, ipd, day))
