# https://code.ptit.edu.vn/student/question/ICPC0114
# PERFECT PRIME

import math

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def check(n):
    total = 0
    while n > 0:
        tmp = n % 10
        if tmp == 2 or tmp == 3 or tmp == 5 or tmp == 7:
            total += tmp
        else:
            return False
        n //= 10
    return isPrime(total)

for _ in range(int(input())):
    n = input()
    if isPrime(int(n)) and isPrime(int(n[::-1])) and check(int(n)):
        print("Yes")
    else:
        print("No")