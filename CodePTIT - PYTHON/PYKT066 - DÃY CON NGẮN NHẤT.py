# https://code.ptit.edu.vn/student/question/PYKT066
# DÃY CON NGẮN NHẤT

from math import gcd

tc = int(input())

ip = []
while True:
    try:
        ip.extend(map(int, input().split()))
    except EOFError:
        break
idx = 0
for _ in range(tc):
    n, k = ip[idx], ip[idx+1]
    a = ip[idx+2:idx+2+n]
    idx += 2 + n
    res = n + 1
    for i in range(n):
        curr_gcd = 0
        for j in range(i, n):
            curr_gcd = gcd(curr_gcd, a[j])
            if curr_gcd == k:
                res = min(res, j - i + 1)
                break
    print(res if res <= n else -1)