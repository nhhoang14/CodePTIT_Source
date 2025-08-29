#https://code.ptit.edu.vn/student/question/PY01058
#ĐOẠN CUỐI NGUYÊN TỐ
import math

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

for t in range(int(input())):
    s = input()
    res = int(s[-4:])
    if isPrime(res):
        print("YES")
    else:
        print("NO")