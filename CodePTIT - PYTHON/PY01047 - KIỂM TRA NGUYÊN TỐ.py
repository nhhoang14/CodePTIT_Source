# https://code.ptit.edu.vn/student/question/PY01047
# KIỂM TRA NGUYÊN TỐ

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

for tc in range(int(input())):
    n = input()
    tmp = n[-4:]
    num = int(tmp)
    if is_prime(num):
       print("YES")
    else:
       print("NO")