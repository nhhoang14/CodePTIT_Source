# https://code.ptit.edu.vn/student/question/PY01044
# XỬ LÝ XÂU KÝ TỰ

s1 = set(input().lower().split())
s2 = set(input().lower().split())
uni = sorted(s1 | s2)
inter = sorted(s1 & s2)
print(" ".join(uni))
print(" ".join(inter))