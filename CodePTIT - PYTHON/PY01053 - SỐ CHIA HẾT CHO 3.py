#https://code.ptit.edu.vn/student/question/PY01053
#SỐ CHIA HẾT CHO 3

for _ in range(int(input())):
    s = input()
    total = 0
    for c in s:
        total = total + int(c)
    if total % 3 == 0:
        print("YES")
    else:
        print("NO")