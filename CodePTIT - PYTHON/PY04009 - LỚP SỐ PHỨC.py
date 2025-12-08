# https://code.ptit.edu.vn/student/question/PY04009
# LỚP SỐ PHỨC

class Complex:
    def __init__(self, r = 0, i = 0):
        self.r = r
        self.i = i

    def __add__(self, other):
        return Complex(self.r + other.r, self.i + other.i)

    def __mul__(self, other):
        r = self.r * other.r - self.i * other.i
        i = self.r * other.i + self.i * other.r
        return Complex(r, i)

    def __str__(self):
        return f"{self.r} + {self.i}i"


for _ in range(int(input())):
    a, b, c, d = map(int, input().split())
    x = Complex(a, b)
    y = Complex(c, d)
    s = x + y
    C = s * x
    D = s * s
    print(f"{C}, {D}")
