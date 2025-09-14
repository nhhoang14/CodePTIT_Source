# https://code.ptit.edu.vn/student/question/PY04004
# LỚP PHÂN SỐ - 2

import math

class PS:
    def __init__(self, tu, mau):
        self.tu = tu
        self.mau = mau
        self.rut_gon()

    def rut_gon(self):
        uc = math.gcd(self.tu, self.mau)
        self.tu //= uc
        self.mau //= uc

    def __add__(self, other):
        tu = self.tu * other.mau + self.mau * other.tu
        mau = self.mau * other.mau
        return PS(tu, mau)

    def __str__(self):
        return f'{self.tu}/{self.mau}'

arr = list(map(int, input().split()))
if arr[1] > 0 and arr[3] > 0:
    a = PS(arr[0], arr[1])
    b = PS(arr[2], arr[3])
    c = a + b
    print(c)