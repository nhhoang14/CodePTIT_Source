# https://code.ptit.edu.vn/student/question/PYKT098
# LOẠI BỎ SỐ NGUYÊN

ds = []
with open("DATA.in", "r") as f:
    for line in f:
        for c in line.strip().split():
            try:
                val = int(c)
                if abs(val) >= 10 ** 18:
                    ds.append(c)
            except ValueError:
                ds.append(c)
ds.sort()
print(" ".join(ds))
