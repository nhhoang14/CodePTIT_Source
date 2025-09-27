# https://code.ptit.edu.vn/student/question/PYKT093
# TÍNH ĐIỂM TRUNG BÌNH

class SinhVien:
    def __init__(self, id, name, gpa):
        self.id = f'SV{id:02d}'
        self.name = name.strip().title()
        self.gpa = round(gpa + 0.001, 2)

    def __str__(self):
        return f'{self.id} {self.name} {self.gpa:.2f}'

lst = []
for i in range(int(input())):
    name = input().strip()
    d1 = float(input())
    d2 = float(input())
    d3 = float(input())
    mark = ((d1 + d2) * 3 + d3 * 2) / 8
    lst.append(SinhVien(i + 1, name, mark))
lst.sort(key=lambda x: (-x.gpa, x.id))
rank = 1
print(lst[0], rank)
for i in range(1, len(lst)):
    if lst[i].gpa != lst[i - 1].gpa:
        rank = i + 1
    print(lst[i], rank)