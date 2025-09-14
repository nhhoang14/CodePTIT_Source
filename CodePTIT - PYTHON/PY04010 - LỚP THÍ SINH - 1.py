# https://code.ptit.edu.vn/student/question/PY04010
# LỚP THÍ SINH - 1

class ThiSinh:
    def __init__(self, name, dob, m1, m2, m3):
        self.name = name
        self.dob = dob
        self.m1 = m1
        self.m2 = m2
        self.m3 = m3

    def total(self):
        return self.m1 + self.m2 + self.m3

    def __str__(self):
        return f'{self.name} {self.dob} {self.total()}'

ts = ThiSinh(input(), input(), float(input()), float(input()), float(input()))
print(ts)