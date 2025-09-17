# https://code.ptit.edu.vn/student/question/PY04021
# TÍNH TOÁN THỜI GIAN

class KhachHang:
    def __init__(self, id, name, total):
        self.id = id
        self.name = name
        self.total = total

    def getFormTime(self):
        hour = self.total//60
        minute = self.total - 60 * hour
        return f'{hour} gio {minute} phut'

    def __str__(self):
        return f'{self.id} {self.name} {self.getFormTime()}'


lst = []
for _ in range(int(input())):
    id = input()
    name = input()
    st = input()
    en = input()
    totalHour = int(en[:2]) * 60 - int(st[:2]) * 60
    totalMinute = int(en[3:]) - int(st[3:])
    lst.append(KhachHang(id, name, totalHour + totalMinute))
lst.sort(key=lambda x: -x.total)
print(*lst, sep='\n')
