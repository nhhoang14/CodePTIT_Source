# https://code.ptit.edu.vn/student/question/PY03007
# XỬ LÝ VĂN BẢN

import sys, re

text = sys.stdin.read().lower()
words = re.findall(r'[a-z0-9]+|[.!?,:]', text)
words = [w for w in words if w]
lines = {}
i = 0
for w in words:
    if w in ".!?":
        lines[i] = lines[i] + w
        lines[i] = lines[i][0].upper() + lines[i][1: - 1]  # viết hoa đầu câu
        i += 1
    else:
        lines[i] = lines.get(i, "") + (" " if lines.get(i) and w not in ',:' else "") + w

for v in lines.values():
    print(v)
