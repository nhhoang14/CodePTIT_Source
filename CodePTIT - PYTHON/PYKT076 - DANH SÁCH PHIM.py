# https://code.ptit.edu.vn/student/question/PYKT076
# DANH SÁCH PHIM

from datetime import datetime

class Phim:
    def __init__(self, id, type, date, name, ep):
        self.id = f'P{id:03d}'
        self.type = type
        self.date = date
        self.name = name
        self.ep = ep

    def getFormDate(self):
        return datetime.strptime(self.date, "%d/%m/%Y")

    def __str__(self):
        return f'{self.id} {self.type} {self.date} {self.name} {self.ep}'

ds = {}
n, m = map(int, input().split())
for i in range(n):
    ds[f'TL{i + 1:03d}'] = input()
lst = []
for i in range(m):
    code = input()
    date = input()
    name = input()
    ep = int(input())
    lst.append(Phim(i + 1, ds[code], date, name, ep))
lst.sort(key=lambda x: (x.getFormDate()))
for p in lst:
    print(p)
