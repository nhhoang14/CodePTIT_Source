# https://code.ptit.edu.vn/student/question/PY02007
# CHIA DƯ CHO 42

import sys

lst = [int(n) for n in sys.stdin.read().split()]
for i in range(len(lst)):
    lst[i] %= 42
s = set(lst)
print(len(s))
