#https://code.ptit.edu.vn/student/question/PY01004
#NGUYÊN TỐ

import math

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

tc = int(input())
for _ in range(tc):
    n = int(input())
    k = 0
    for i in range(1, n):
        if math.gcd(n, i) == 1:
            k += 1
            
    if isPrime(k):
        print("YES")
    else:
        print("NO")