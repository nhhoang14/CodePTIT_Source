# https://code.ptit.edu.vn/student/question/PY01022
# TỔNG CHỮ SỐ

s = input()
cnt = 0
while len(s) > 1:
    total = sum(ord(c) - 48 for c in s)
    s = str(total)
    cnt += 1
print(cnt if cnt > 0 else 1)
