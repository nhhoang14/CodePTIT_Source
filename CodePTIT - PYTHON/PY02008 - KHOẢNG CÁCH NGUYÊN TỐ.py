# https://code.ptit.edu.vn/student/question/PY02008
# KHOẢNG CÁCH NGUYÊN TỐ

def sieve():
    is_prime = [True] * (10**6 + 1)
    is_prime[0] =  is_prime[1] = False
    for i in range(2, 10**6 + 1):
        if is_prime[i]:
            for j in range(i * i, 10**6 + 1, i):
                is_prime[j] = False
    return [i for i, ok in enumerate(is_prime) if ok]


prime = sieve()
n, x = map(int, input().split())
res = [x]
for i in range(n):
    res.append(res[i] + prime[i])
print(*res)
