# https://code.ptit.edu.vn/student/question/PY04016
# LẬP HÓA ĐƠN - 2

from datetime import datetime

class Khach:
    def __init__(self, id, name, room, st, en, fee):
        self.id = id
        self.name = name
        self.room = room
        self.st = st
        self.en = en
        self.fee = fee

    def getDay(self):
        d1 = datetime.strptime(self.st, "%d/%m/%Y")
        d2 = datetime.strptime(self.en, "%d/%m/%Y")
        return (d2 - d1).days + 1

    def getTotal(self):
        price = [25, 34, 50, 80]
        return price[self.room // 100 - 1] * self.getDay() + self.fee

    def __str__(self):
        return f'{self.id} {self.name} {self.room} {self.getDay()} {self.getTotal()}'

lst = []
for i in range(int(input())):
    id = f'KH{i+1:02d}'
    name = input().strip()
    room = int(input())
    st = input().strip()
    en = input().strip()
    fee = int(input())
    lst.append(Khach(id, name, room, st, en, fee))
lst.sort(key=lambda x: -x.getTotal())
print(*lst, sep='\n')
