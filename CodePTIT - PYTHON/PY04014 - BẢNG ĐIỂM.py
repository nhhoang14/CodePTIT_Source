# https://code.ptit.edu.vn/student/question/PY04014
# BẢNG ĐIỂM

class ThiSinh:
    def __init__(self, id, name, total):
        self.id = id
        self.name = name
        self.avg = round(total / 12 + 0.01, 1)

    def getRank(self):
        if self.avg >= 9:
            return 'XUAT SAC'
        elif self.avg >= 8:
            return 'GIOI'
        elif self.avg >= 7:
            return 'KHA'
        elif self.avg >= 5:
            return 'TB'
        else:
            return 'YEU'

    def __str__(self):
        return f'{self.id} {self.name} {self.avg} {self.getRank()}'


lst = []
for i in range(int(input())):
    id = 'HS{:02}'.format(i + 1)
    name = input()
    diem = list(map(float, input().split()))
    total = sum(diem) + diem[0] + diem[1]
    lst.append(ThiSinh(id, name, total))
lst.sort(key=lambda x: (-x.avg, x.id))
print(*lst, sep='\n')
