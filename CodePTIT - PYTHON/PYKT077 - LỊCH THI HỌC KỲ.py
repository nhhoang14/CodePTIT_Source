# https://code.ptit.edu.vn/student/question/PYKT077
# LỊCH THI HỌC KỲ

from datetime import datetime


class CaThi:
    def __init__(self, id, code, name, date, st, group):
        self.id = f'T{id:03d}'
        self.code = code
        self.name = name
        self.date = date
        self.st = st
        self.group = group

    def getFormDate(self):
        return datetime.strptime(f"{self.date} {self.st}", "%d/%m/%Y %H:%M")

    def __str__(self):
        return f'{self.id} {self.code} {self.name} {self.date} {self.st} {self.group}'


ds = {}
n, m = map(int, input().split())
for i in range(n):
    code = input()
    ds[code] = input()
lst = []
for i in range(m):
    code, date, st, group = input().split()
    lst.append(CaThi(i + 1, code, ds[code], date, st, group))
lst.sort(key=lambda x: (x.getFormDate()))
for p in lst:
    print(p)
