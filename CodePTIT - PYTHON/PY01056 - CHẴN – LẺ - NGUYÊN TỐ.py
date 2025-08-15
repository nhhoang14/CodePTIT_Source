#https://code.ptit.edu.vn/student/question/PY01056
#CHẴN – LẺ - NGUYÊN TỐ

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def check(s):
    total = sum (int(ch) for ch in s)
    if not is_prime(total):
        return "NO"
    for i, ch in enumerate(s):
        num = int(ch)
        if(i % 2 == 0 and num % 2 != 0) or (i % 2 != 0 and num % 2 == 0):
            return "NO"
    return "YES"

tc = int(input())
for _ in range(tc):
    s = input()
    print(check(s))
