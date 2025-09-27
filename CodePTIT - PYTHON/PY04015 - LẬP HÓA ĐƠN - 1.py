# https://code.ptit.edu.vn/student/question/PY04015
# LẬP HÓA ĐƠN - 1

class Khach:
    def __init__(self, id, name, st, en):
        self.id = id
        self.name = name
        self.st = st
        self.en = en

    def getTotal(self):
        cnt = self.en - self.st
        res = 0
        fee = 0
        if cnt > 100:
            res = 50 * 100 + 50 * 150 + (cnt - 100) * 200
            fee = 1.05
        elif 50 < cnt <= 100:
            res = 50 * 100 + (cnt - 50) * 150
            fee = 1.03
        else:
            res = cnt * 100
            fee = 1.02
        return int(res * fee + 0.5)

    def __str__(self):
        return f'{self.id} {self.name} {self.getTotal()}'

lst = []
for i in range(int(input())):
    id = f'KH{i+1:02d}'
    name = input().strip()
    st = int(input())
    en = int(input())
    lst.append(Khach(id, name, st, en))
lst.sort(key=lambda x: -x.getTotal())
print(*lst, sep='\n')
