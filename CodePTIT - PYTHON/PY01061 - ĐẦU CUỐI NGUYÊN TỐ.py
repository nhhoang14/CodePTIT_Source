#https://code.ptit.edu.vn/student/question/PY01061
#ĐẦU CUỐI NGUYÊN TỐ

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

for t in range(int(input())):
    s = input()
    if is_prime(int(s[:3])) and is_prime(int(s[-3:])):
        print("YES")
    else:
        print("NO")
