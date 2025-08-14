#https://code.ptit.edu.vn/student/question/PY01025
#CHÈN DẤU PHẨY

s = input()
for i in range(len(s) - 3, 0, -3):
    s = s[:i] + "," + s[i:]
print(s)