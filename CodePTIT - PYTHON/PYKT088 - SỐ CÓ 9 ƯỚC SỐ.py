# https://code.ptit.edu.vn/student/question/PYKT088
# SỐ CÓ 9 ƯỚC SỐ

def sieve(n):
    limit = int(n**0.5) + 1
    prime = [True] * (limit + 1)
    prime[0] = prime[1] = False
    for i in range(2, int(limit**0.5) + 1):
        if prime[i]:
            for j in range(i * i, limit + 1, i):
                prime[j] = False
    return [i for i in range(limit + 1) if prime[i]]

n = int(input())
primes = sieve(n)
cnt = 0
for i in primes:
    if i**8 <= n:
        cnt += 1
    else:
        break

for i in range(len(primes)):
    p = primes[i]
    for j in range(i + 1, len(primes)):
        q = primes[j]
        if p**2 * q**2 <= n:
            cnt += 1
        else:
            break
print(cnt)