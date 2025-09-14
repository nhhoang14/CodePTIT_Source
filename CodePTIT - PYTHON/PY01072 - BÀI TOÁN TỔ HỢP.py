# https://code.ptit.edu.vn/student/question/PY01072
# BÀI TOÁN TỔ HỢP

def sinh(res, k, arr):
    length = len(arr)
    i = k - 1
    while i >= 0 and res[i] == arr[length - k + i]:
        i -= 1
    if i < 0:
        return None
    pos = arr.index(res[i]) + 1
    res[i] = arr[pos]
    for j in range(i + 1, k):
        res[j] = arr[pos + j - i]
    return res

n, k = map(int, input().split())
tmp = set(map(int, input().split()))
arr = list(tmp)
arr.sort()
res = arr[:k]
while res is not None:
    print(*res)
    res = sinh(res, k, arr)