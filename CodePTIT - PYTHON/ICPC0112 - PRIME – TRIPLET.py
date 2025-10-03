# https://code.ptit.edu.vn/student/question/ICPC0112
# PRIME – TRIPLET

def sieve():
    limit = 10 ** 6
    primes = [True] * (limit + 1)
    primes[0] = primes[1] = False
    for i in range(2, int(limit ** 0.5) + 1):
        if primes[i]:
            for j in range(i * i, limit + 1, i):
                primes[j] = False
    return [k for k, v in enumerate(primes) if v == True]

prime = sieve()
prime_set = set(prime)
for _ in range(int(input())):
    n = int(input())
    cnt = 0
    for x in prime:
        if x + 6 >= n: break
        if ((x + 2) in prime_set or (x + 4) in prime_set) and (x + 6 in prime_set):
            cnt += 1
    print(cnt)
