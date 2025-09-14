# https://code.ptit.edu.vn/student/question/PY04003
# LỚP PHÂN SỐ - 1

import math

class PS:
    def __init__(self, tu, mau):
        self.tu = tu
        self.mau = mau
        self.rutgon()

    def rutgon(self):
        uc = math.gcd(self.tu, self.mau)
        self.tu //= uc
        self.mau //= uc

arr = list(map(int, input().split()))
if arr[1] > 0:
    ps = PS(arr[0], arr[1])
    print('{}/{}'.format(ps.tu, ps.mau))