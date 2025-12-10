# https://code.ptit.edu.vn/student/question/PY02071
# TỔNG CÁC SỐ TỰ NHIÊN

res = []

def Try(i, max_val, cur):
    if i == 0:
        res.append("(" + " ".join(map(str, cur)) + ")")
        return
    
    for j in range(min(i, max_val), 0, -1):
        cur.append(j)
        Try(i - j, j, cur)
        cur.pop()


for _ in range(int(input())):
    n = int(input())
    Try(n, n, [])
    print(len(res))
    print(*res)
    res.clear()
