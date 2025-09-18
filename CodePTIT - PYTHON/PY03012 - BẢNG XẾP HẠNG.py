# https://code.ptit.edu.vn/student/question/PY03012
# BẢNG XẾP HẠNG

class SinhVien:
    def __init__(self, n, ac, submit):
        self.n = n
        self.ac = ac
        self.submit = submit

    def __str__(self):
        return f'{self.n} {self.ac} {self.submit}'

ds = []
for _ in range(int(input())):
    name = input().strip()
    ac, submit = map(int, input().strip().split())
    ds.append(SinhVien(name, ac, submit))
ds.sort(key=lambda d: (-d.ac, d.submit, d.n))
print(*ds, sep='\n')