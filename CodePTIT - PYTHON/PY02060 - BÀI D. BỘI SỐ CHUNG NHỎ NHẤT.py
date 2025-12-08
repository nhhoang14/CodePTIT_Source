# https://code.ptit.edu.vn/student/question/PY02060
# BÀI D. BỘI SỐ CHUNG NHỎ NHẤT

MOD = 10**9 + 7

def sieve(n):
    prime = [True]*(n+1)
    prime[0] = prime[1] = False
    primes = []
    for i in range(2, n+1):
        if prime[i]:
            primes.append(i)
            for j in range(i*i, n+1, i):
                prime[j] = False
    return primes

def count_pairs(a, b, primes):
    res = 1
    a1 = a - 1
    for p in primes:
        if p > b:
            break
        e = 0
        tmp = p
        while tmp <= b:
            e += b // tmp - a1 // tmp
            if tmp > b // p:
                break
            tmp *= p
        if e > 0:
            res = res * (2*e + 1) % MOD
    return res

tests = []
last = 0
for _ in range(int(input())):
    a, b = map(int, input().split())
    last = max(last, b)
    tests.append((a, b))
primes = sieve(last)
for a, b in tests:
    print(count_pairs(a, b, primes))
