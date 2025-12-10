# https://code.ptit.edu.vn/student/question/PY02014
# BIẾN ĐỔI NGUYÊN TỐ

def sieve():
    limit = 10001
    prime = [True] * limit
    prime[0] = prime[1] = False
    for i in range(2, int(limit**0.5) + 1):
        if prime[i]:
            for j in range(i*i, limit, i):
                prime[j] = False
    return [i for i in range(limit) if prime[i]]

def next_prime(x, prime):
    for i in range(len(prime)):
        if prime[i] >= x:
            return i
    return None

n = int(input())
prime = sieve()
a = list(map(int, input().split()))
res = 0
last = a[0]
for i in range(n):
    if a[i] not in prime:
        tmp = next_prime(a[i], prime)
        min_step = min(abs(prime[tmp - 1] - a[i]), abs(prime[tmp] - a[i]))
        res = max(res, min_step)
print(res)