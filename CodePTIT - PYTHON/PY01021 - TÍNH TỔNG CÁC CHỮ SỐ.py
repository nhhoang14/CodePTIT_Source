# https://code.ptit.edu.vn/student/question/PY01021
# TÍNH TỔNG CÁC CHỮ SỐ

for _ in range(int(input())):
    s = input()
    res = sorted([c for c in s if not c.isdigit()])
    total = sum(int(c) for c in s if c.isdigit())
    if total:
        res.append(str(total))
    print(''.join(res))
