# https://code.ptit.edu.vn/student/question/PY04005
# LỚP TRIANGLE - 1

import math
import sys

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self, other):
        return math.sqrt((self.x - other.x) ** 2 + (self.y - other.y) ** 2)

inputs = sys.stdin.read().split()
i = 1
for _ in range(int(inputs[0])):
    Ax, Ay, Bx, By, Cx, Cy = map(float, inputs[i:i + 6])
    i += 6
    a = Point(Ax, Ay)
    b = Point(Bx, By)
    c = Point(Cx, Cy)
    ab = a.distance(b)
    bc = b.distance(c)
    ac = a.distance(c)
    if ab + bc > ac and bc + ac > ab and ab + ac> bc :
        print("{:.3f}".format(ab + bc + ac))
    else:
        print('INVALID')