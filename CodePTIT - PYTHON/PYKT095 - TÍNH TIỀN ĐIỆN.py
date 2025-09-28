# https://code.ptit.edu.vn/student/question/PYKT095
# TÍNH TIỀN ĐIỆN

class KhachHang:

    def __init__(self, id, name, type, range):
        self.id = id
        self.name = " ".join(name.title().split())
        self.type = type
        self.range = range
        self.inDm = 0
        self.outDm = 0
        self.getPriceDm()

    def getDm(self):
        if self.type == 'A':
            return 100
        elif self.type == 'B':
            return 500
        return 200

    def getPriceDm(self):
        dm = self.getDm()
        if self.range < dm:
            self.inDm = self.range * 450
        else:
            self.inDm = dm * 450
            self.outDm = (self.range - dm) * 1000

    def getVAT(self):
        return self.outDm // 20

    def getTotal(self):
        return self.inDm + self.outDm + self.getVAT()

    def __str__(self):
        return f'{self.id} {self.name} {self.inDm} {self.outDm} {self.getVAT()} {self.getTotal()}'


ds = []
for i in range(int(input())):
    id = f'KH{i + 1:02d}'
    name = input().strip()
    type, st, en = input().split()
    range = int(en) - int(st)
    ds.append(KhachHang(id, name, type, range))
ds.sort(key=lambda x : -x.getTotal())
for x in ds:
    print(x)