#https://code.ptit.edu.vn/student/question/PY01009
#CHỮ HOA – CHỮ THƯỜNG

s = input()
cnt = 0
for i in range(len(s)):
    if 'a' <= s[i] <= 'z': cnt += 1
if cnt >= len(s)/2:
    print(s.lower())
else:
    print(s.upper())