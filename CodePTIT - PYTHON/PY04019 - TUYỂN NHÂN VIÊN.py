# https://code.ptit.edu.vn/student/question/PY04019
# TUYỂN NHÂN VIÊN

class ThiSinh:
    def __init__(self, id, name, total):
        self.id = id
        self.name = name
        self.avg = round(total / 2 + 0.001, 2)

    def getRank(self):
        if self.avg > 9.5:
            return 'XUAT SAC'
        elif self.avg >= 8 and self.avg <= 9.5:
            return 'DAT'
        elif self.avg >= 5 and self.avg < 8:
            return 'CAN NHAC'
        else:
            return 'TRUOT'

    def __str__(self):
        return f'{self.id} {self.name} {self.avg:.2f} {self.getRank()}'


lst = []
for i in range(int(input())):
    id = "TS0" + str(i + 1)
    name = input()
    diemLT = float(input())
    diemTH = float(input())
    diemLT = diemLT / 10 if diemLT > 10 else diemLT
    diemTH = diemTH / 10 if diemTH > 10 else diemTH
    total = diemTH + diemLT
    lst.append(ThiSinh(id, name, total))
lst.sort(key=lambda x: (-x.avg, x.id))
print(*lst, sep='\n')