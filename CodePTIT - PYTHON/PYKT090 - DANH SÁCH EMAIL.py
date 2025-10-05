# https://code.ptit.edu.vn/student/question/PYKT090
# DANH SÁCH EMAIL

with open("VANBAN.in", "r", encoding="utf-8") as f:
    ds = [line.lower().strip() for line in f]
    ds = sorted(set(ds))
    print(*ds, sep="\n")