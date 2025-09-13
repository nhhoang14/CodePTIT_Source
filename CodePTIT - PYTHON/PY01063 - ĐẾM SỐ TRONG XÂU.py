# https://code.ptit.edu.vn/student/question/PY01063
# ĐẾM SỐ TRONG XÂU

for t in range(int(input())):
    a = input()
    b = input()
    end = len(a) - len(b)
    i = 0
    cnt = 0
    while i < end + 1:
        tmp = a[i:i+len(b)]
        if b == tmp:
            cnt += 1
            i = i + len(b)
        else:
            i += 1
    print(cnt)
