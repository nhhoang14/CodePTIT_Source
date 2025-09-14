# https://code.ptit.edu.vn/student/question/ICPC0113
# EMIRP NUMBER

import math

def sieve(limit=10**6):
    is_prime = [True] * (limit + 1)
    is_prime[0] = is_prime[1] = False
    for i in range(2, math.isqrt(limit) + 1):
        if is_prime[i]:
            for j in range(i * i, limit + 1, i):
                is_prime[j] = False
    return set([i for i, ok in enumerate(is_prime) if ok])

prime = sieve()
for _ in range(int(input())):
    n = int(input())
    used = set()
    for p in prime:
        if 13 <= p < n and p not in used:
            rev = int(str(p)[::-1])
            if rev != p and rev in prime and rev < n:
                print(p, rev, end=" ")
                used.add(p)
                used.add(rev)
    print()