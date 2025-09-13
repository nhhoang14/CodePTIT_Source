# https://code.ptit.edu.vn/student/question/ICPC0107
# THAY ĐỔI CHỮ SỐ

for _ in range(int(input())):
    p, q = input().split()
    ip = input().split()
    if len(ip) == 1:
        a = ip[0]
        b = input()
    else:
        a, b = ip
    minRes = int(a.replace(p, q)) + int(b.replace(p, q))
    maxRes = int(a.replace(q, p)) + int(b.replace(q, p))

    print(min(minRes,maxRes), max(minRes,maxRes))
