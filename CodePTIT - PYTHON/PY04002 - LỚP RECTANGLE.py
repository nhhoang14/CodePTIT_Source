# https://code.ptit.edu.vn/student/question/PY04002
# LỚP RECTANGLE

class Rectangle:
    def __init__(self, h, w, c):
        self.h = h
        self.w = w
        self.c = c

    def perimeter(self):
        return (self.h + self.w) * 2

    def area(self):
        return (self.h * self.w)

    def color(self):
        return self.c.capitalize()

arr = input().split()
if int(arr[0]) > 0 and int(arr[1]) > 0 :
    r = Rectangle(int(arr[0]), int(arr[1]), arr[2])
    print('{} {} {}'.format(r.perimeter(), r.area(), r.color()))
else:
    print('INVALID')