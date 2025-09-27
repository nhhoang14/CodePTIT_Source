# https://code.ptit.edu.vn/student/question/PYKT092
# ĐIỂM TUYỂN SINH

class ThiSinh:
    def __init__(self, id, name, type, region, mark):
        self.id = f'TS{id:02d}'
        self.name = name.lower().strip()
        self.type = type
        self.region = region
        self.mark = mark

    def getFormName(self):
        s = self.name.split()
        for i in range(len(s)):
            s[i] = s[i][0].upper() + s[i][1:]
        return ' '.join(s)

    def getTotal(self):
        region_bonus = {1: 1.5, 2: 1.0}.get(self.region, 0)
        type_bonus = 1.5 if self.type != "Kinh" else 0
        return self.mark + region_bonus + type_bonus

    def getStatus(self):
        return "Do" if self.getTotal() >= 20.5 else "Truot"

    def __str__(self):
        return f'{self.id} {self.getFormName()} {round(self.getTotal(),1)} {self.getStatus()}'

lst = []
for i in range(int(input())):
    name = input()
    mark = float(input())
    type = input()
    region = int(input())
    lst.append(ThiSinh(i + 1, name, type, region, mark))
lst.sort(key=lambda x: (x.getTotal()), reverse=True)
for p in lst:
    print(p)