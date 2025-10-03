# https://code.ptit.edu.vn/student/question/PYKT096
# DANH SÁCH THI LẬP TRÌNH

class SinhVien:
    def __init__(self, id, name, uni):
        self.id = id
        self.name = name
        self.uni = uni

    def __str__(self):
        return f'{self.id} {self.name} {self.uni}'


dsUni = {}
dsSV = []
for i in range(int(input())):
    idUni = input()
    dsUni[i + 1] = idUni + " " + input()
for i in range(int(input())):
    id = f'C{i + 1:03d}'
    name = input()
    team = int(input()[-2:])
    uni = dsUni[team]
    dsSV.append(SinhVien(id, name, uni))
dsSV.sort(key=lambda x: x.name)
print(*dsSV, sep='\n')
