# https://code.ptit.edu.vn/student/question/PY01057
# VỊ TRÍ NGUYÊN TỐ

def isPrime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def check(s):
    for i in range(len(s)):
        if isPrime(i) and not isPrime(int(s[i])):
                return "NO"
        elif not isPrime(i) and isPrime(int(s[i])):
            return "NO"
    return "YES"

for _ in range(int(input())):
    s = input()
    print(check(s))
