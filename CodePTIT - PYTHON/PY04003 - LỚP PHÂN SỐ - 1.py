# https://code.ptit.edu.vn/student/question/PY04003
# LỚP PHÂN SỐ - 1

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

    def __str__(self):
        return f'{self.tu}/{self.mau}'

arr = list(map(int, input().split()))
if arr[1] > 0:
    ps = PS(arr[0], arr[1])
    print(ps)