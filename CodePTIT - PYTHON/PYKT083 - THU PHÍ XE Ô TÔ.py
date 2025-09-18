# https://code.ptit.edu.vn/student/question/PYKT083
# THU PHÍ XE Ô TÔ

def fee(type, seat):
    if type == 'Xe_con':
        return 10000 if seat == '5' else 15000
    if type == 'Xe_khach':
        return 50000 if seat == '29' else 70000
    return 20000


fees = {}
for _ in range(int(input())):
    plate, type, seat, direction, date = input().split()
    if direction == 'OUT': continue
    fees[date] = fees.get(date, 0) + fee(type, seat)
for k, v in fees.items():
    print(f'{k}: {v}')
