# https://code.ptit.edu.vn/student/question/ICPC0104
# TÌM SỐ NHỎ NHẤT

for _ in range(int(input())):
    s = input()
    arr = []
    tmp = 0
    for c in s:
        if c.isdigit():
            tmp = tmp * 10 + int(c)
        else:
            if tmp > 0:
                arr.append(tmp)
            tmp = 0
    if tmp > 0:
        arr.append(tmp)
    print(min(arr))