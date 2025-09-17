# https://code.ptit.edu.vn/student/question/PY04017
# TÍNH VẬN TỐC

class ThiSinh:
    def __init__(self, name, city, total):
        self.name = name
        self.city = city
        self.speed = 120 / total
        self.getID()

    def getID(self):
        res = ''.join([w[0] for w in self.city.split()]) + ''.join([w[0] for w in self.name.split()])
        self.id = res.upper()

    def __str__(self):
        return f'{self.id} {self.name} {self.city} {round(self.speed)} Km/h'


lst = []
for _ in range(int(input())):
    name = input()
    city = input()
    en = input()
    h, m = map(int, en.split(':'))
    total = (h - 6) + m / 60
    lst.append(ThiSinh(name, city, total))
lst.sort(key=lambda x: -x.speed)
print(*lst, sep='\n')
