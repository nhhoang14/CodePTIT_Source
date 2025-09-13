# https://code.ptit.edu.vn/student/question/PY02019
# NGUYÊN TỐ CÙNG NHAU

import math

n = int(input())
arr = list(map(int, input().split()))
arr.sort()
for i in range(n - 1):
    for j in range(i + 1, n):
        if math.gcd(arr[i], arr[j]) == 1:
            print(arr[i], arr[j])
