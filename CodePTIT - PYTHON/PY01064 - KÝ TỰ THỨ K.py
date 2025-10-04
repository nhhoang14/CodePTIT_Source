# https://code.ptit.edu.vn/student/question/PY01064
# KÝ TỰ THỨ K

def sieve():
    tmp = [1] * 25
    for i in range(1, 25):
        tmp[i] = tmp[i - 1] * 2 + 1
    return tmp

def find(n, k):
    length = ds[n - 1]
    mid = length // 2 + 1
    if k == mid:
        return n - 1
    elif k > mid:
        return find(n - 1, k - mid)
    else:
        return find(n - 1, k)

ds = sieve()
for _ in range(int(input())):
    n, k = map(int, input().split())
    print(chr(ord('A') + find(n, k)))
