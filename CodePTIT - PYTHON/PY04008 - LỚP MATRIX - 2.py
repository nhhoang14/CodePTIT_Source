# https://code.ptit.edu.vn/student/question/PY04008
# LỚP MATRIX - 2

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

lst, t = [], int(input())
try:
    while True:
        val = map(int, input().split())
        lst += val
except EOFError:
    pass
i = 0
for _ in range(t):
    n, m = lst[i], lst[i + 1]
    i += 2
    tmp = []
    for _ in range(n):
        tmp.append(lst[i:i + m])
        i += m
    mt = Matrix(n, m, tmp)
    print(mt.mul_transpose())