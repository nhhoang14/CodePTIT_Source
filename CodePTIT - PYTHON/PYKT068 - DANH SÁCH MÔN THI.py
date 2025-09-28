# https://code.ptit.edu.vn/student/question/PYKT068
# DANH SÁCH MÔN THI

class MonHoc:
    def __init__(self, id, name, method):
        self.id = id
        self.name = name
        self.method = method

    def __str__(self):
        return f'{self.id} {self.name} {self.method}'

ds = []
for _ in range(int(input())):
    id = input()
    name = input()
    method = input()
    ds.append(MonHoc(id, name, method))
ds.sort(key=lambda x : x.id)
print(*ds, sep='\n')