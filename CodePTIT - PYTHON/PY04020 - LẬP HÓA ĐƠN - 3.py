# https://code.ptit.edu.vn/student/question/PY04020
# LẬP HÓA ĐƠN - 3

class HoaDon:
    def __init__(self, id, name, qty, price, discount):
        self.id = id
        self.name = name
        self.qty = qty
        self.price = price
        self.discount = discount

    def getTotal(self):
        return self.qty * self.price - self.discount

    def __str__(self):
        return f'{self.id} {self.name} {self.qty} {self.price} {self.discount} {self.getTotal()}'


lst = []
for i in range(int(input())):
    id = input().strip()
    name = input().strip()
    qty = int(input())
    price = int(input())
    discount = int(input())
    lst.append(HoaDon(id, name, qty, price, discount))
lst.sort(key=lambda x: -x.getTotal())
print(*lst, sep='\n')