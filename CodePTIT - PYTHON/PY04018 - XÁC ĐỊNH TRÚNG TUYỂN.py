# https://code.ptit.edu.vn/student/question/PY04018
# XÁC ĐỊNH TRÚNG TUYỂN

class GiaoVien:
    def __init__(self, id, name, code, total):
        self.id = id
        self.name = name
        self.code = code
        self.total = total
        self.getLastTotal()

    def getSub(self):
        kt = self.code[0]
        if kt == 'A':
            return "TOAN"
        elif kt == 'B':
            return "LY"
        else:
            return "HOA"

    def getLastTotal(self):
        kt = self.code[1]
        if kt == '1':
            self.total += 2
        elif kt == '2':
            self.total += 1.5
        elif kt == '3':
            self.total += 1

    def getPass(self):
        return "TRUNG TUYEN" if self.total >= 18 else "LOAI"

    def __str__(self):
        return f'{self.id} {self.name} {self.getSub()} {self.total} {self.getPass()}'


lst = []
for i in range(int(input())):
    id = f'GV{i + 1:02d}'
    name = input().strip()
    code = input().strip()
    d1 = float(input())
    d2 = float(input())
    total = d1 * 2 + d2
    lst.append(GiaoVien(id, name, code, total))
lst.sort(key=lambda x: -x.total)
print(*lst, sep='\n')
