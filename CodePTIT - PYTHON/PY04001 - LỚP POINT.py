# https://code.ptit.edu.vn/student/question/PY04001
# LỚP POINT

from decimal import Decimal, ROUND_HALF_UP

class Point:
    def __init__(self, x, y):
        self.x = Decimal(str(x))
        self.y = Decimal(str(y))

    def distance(self, other):
        res = ((self.x - other.x) ** 2 + (self.y - other.y) ** 2).sqrt()
        return res.quantize(Decimal("0.0001"), rounding=ROUND_HALF_UP)

if __name__ == '__main__':
    t = int(input())
    while t > 0:
        arr = input().split()
        p1 = Point(Decimal(arr[0]), Decimal(arr[1]))
        p2 = Point(Decimal(arr[2]), Decimal(arr[3]))
        print(p1.distance(p2))
        t -= 1