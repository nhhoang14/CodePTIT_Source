# https://code.ptit.edu.vn/student/question/PYKT075
# SAO CHÉP DANH BẠ

def getName(name):
    return name.split()[-1]

ds = {}
with open("SOTAY.txt", "r", encoding="utf-8") as f:
    lines = [line.strip() for line in f if line.strip()]

i = 0
date = None
while i < len(lines):
    line = lines[i]
    if line.startswith("Ngay"):
        date = line[5:]
        ds[date] = []
        i += 1
    else:
        name = lines[i]
        phone = lines[i + 1]
        ds[date].append((name, phone))
        i += 2

with open("DIENTHOAI.txt", "w", encoding="utf-8") as f:
    for date in ds:
        for name, phone in sorted(ds[date], key=lambda x: (getName(x[0]), x[0])):
            f.write(f"{name}: {phone} {date}\n")
