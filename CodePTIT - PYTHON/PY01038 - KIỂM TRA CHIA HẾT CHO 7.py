# https://code.ptit.edu.vn/student/question/PY01038
# KIỂM TRA CHIA HẾT CHO 7

for _ in range(int(input())):
    s = input()
    cnt = 0
    res = -1
    while cnt <= 1000:
        if(int(s) % 7 == 0):
            res = int(s)
            break
        tmp = int(s) + int(s[::-1])
        cnt += 1
        s = str(tmp)
    print(res)