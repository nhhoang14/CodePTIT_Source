# https://code.ptit.edu.vn/student/question/PYKT087
# SỐ ĐẶC BIỆT

for _ in range(int(input())):
    n, k = map(int, input().split())
    s = bin(k)[2:]
    res = 0
    mod = 10**9 + 7
    for i in range(len(s) - 1, -1, -1):
        if s[i] == '1':
            res = (res + pow(n, len(s) - 1 - i, mod)) % mod
    print(res)
