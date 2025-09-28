# https://code.ptit.edu.vn/student/question/PY03008
# ĐỒ THỊ HÌNH SAO

dscanh = {}
n = int(input())
for _ in range(n - 1):
    u, v = map(int, input().split())
    dscanh[u] = dscanh.get(u, 0) + 1
    dscanh[v] = dscanh.get(v, 0) + 1
res = "No"
for v in dscanh.values():
    if v == n - 1:
        res = "Yes"
        break
print(res)