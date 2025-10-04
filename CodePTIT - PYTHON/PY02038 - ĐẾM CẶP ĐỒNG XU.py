# https://code.ptit.edu.vn/student/question/PY02038
# ĐẾM CẶP ĐỒNG XU

def C(n, k):
    if k > n - k:
        k = n - k
    res = 1
    for i in range(1, k + 1):
        res = res * (n - i + 1) // i
    return res

n = int(input())
mt = [list(input().strip()) for _ in range(n)]
res = 0
for row in mt:
    cnt = row.count('C')
    res += C(cnt, 2)
for i in range(n):
    cnt = sum(1 for j in range(n) if mt[j][i] == 'C')
    if cnt > 1: res += C(cnt, 2)
print(res)
