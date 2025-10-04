# https://code.ptit.edu.vn/student/question/PY02021
# DÃY CON CHUNG CỦA BA DÃY SỐ

def uniList(a, b):
    i, j = 0, 0
    res = []
    while i < len(a) and j < len(b):
        if a[i] == b[j]:
            res.append(a[i])
            i += 1
            j += 1
        elif a[i] < b[j]:
            i += 1
        else :
            j += 1
    return res

for _ in range(int(input())):
    n, m, k  = map(int, input().split())
    a1 = sorted(map(int, input().split()))
    a2 = sorted(map(int, input().split()))
    a3 = sorted(map(int, input().split()))
    res = uniList(uniList(a1, a2), a3)
    if len(res):
        print(*res)
    else:
        print("NO")