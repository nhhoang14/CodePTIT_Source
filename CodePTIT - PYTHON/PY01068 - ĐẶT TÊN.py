# https://code.ptit.edu.vn/student/question/PY01068
# ĐẶT TÊN

def Try(i, st, res):
    if i == k:
        print(" ".join(res))
        return
    for j in range(st, len(ds)):
        if not vs[j]:
            vs[j] = True
            res.append(ds[j])
            Try(i + 1, j + 1, res)
            res.pop()
            vs[j] = False

n, k = map(int, input().split())
ds = sorted(set(input().split()))
vs = [False] * len(ds)
Try(0, 0, [])
