# https://code.ptit.edu.vn/student/question/PY04013
# TÍNH TOÁN LƯỢNG MƯA

from _datetime import datetime

class Tram:
    def __init__(self, id, name, time, ln):
        self.id = id
        self.name = name
        self.time = time
        self.ln = ln

    def getTotal(self):
        return round(self.ln * 60 / self.time, 2)

    def __str__(self):
        return f'{self.id} {self.name} {self.getTotal():.2f}'

lst = []
i = 1
for _ in range(int(input())):
    id = f'T{i:02d}'
    name = input().strip()
    st = datetime.strptime(input(), "%H:%M")
    en = datetime.strptime(input(), "%H:%M")
    ln = int(input())
    time = (en - st).seconds // 60
    found = None
    for obj in lst:
        if obj.name == name:
            found = obj
            break

    if found:
        found.time += time
        found.ln += ln
    else:
        lst.append(Tram(id, name, time, ln))
        i += 1

print(*lst, sep='\n')
