# https://code.ptit.edu.vn/student/question/PY01049
# CHỮ SỐ NGUYÊN TỐ

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

for t in range(int(input())):
    s = input()
    cnt = 0
    for ch in s:
        if is_prime(int(ch)):
            cnt += 1
    if cnt > len(s) - cnt and is_prime(len(s)):
        print("YES")
    else:
        print("NO")
