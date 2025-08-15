#https://code.ptit.edu.vn/student/question/PY01052
#TỔNG CHỮ SỐ NGUYÊN TỐ

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

for tc in range(int(input())):
    s = input().strip()
    total = sum(int(ch) for ch in s)

    if is_prime(total):
        print("YES")
    else:
        print("NO")