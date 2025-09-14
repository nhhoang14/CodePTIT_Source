# https://code.ptit.edu.vn/student/question/PY04007
# LỚP MATRIX - 1

class Matrix:
    def __init__(self, n, m, mt):
        self.n = n
        self.m = m
        self.mt = mt

    def mul_transpose(self):
        res = []
        for i in range(self.n):
            res += [[0] * self.n]
            for j in range(self.n):
                for k in range(self.m):
                    res[i][j] += self.mt[i][k] * self.mt[j][k]
        return Matrix(self.n, self.n, res)

    def __str__(self):
        return '\n'.join(' '.join(map(str, row)) for row in self.mt)

for _ in range(int(input())):
    n, m = map(int, input().split())
    tmp = []
    for i in range(n):
        tmp.append([int(j) for j in input().split()])
    mt = Matrix(n, m, tmp)
    print(mt.mul_transpose())