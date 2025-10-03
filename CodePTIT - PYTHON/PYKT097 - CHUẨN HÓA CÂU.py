# https://code.ptit.edu.vn/student/question/PYKT097
# CHUẨN HÓA CÂU

import sys, re

text = sys.stdin.read().strip().lower()

parts = re.split(r'(?<=[.?!])|\n', text)

for line in parts:
    line = " ".join(line.split())
    line = re.sub(r'\s+([,.!?])', r'\1', line)
    if not line:
        continue
    if line[-1] not in ".!?":
        line += "."
    line = line[0].upper() + line[1:]
    print(line)