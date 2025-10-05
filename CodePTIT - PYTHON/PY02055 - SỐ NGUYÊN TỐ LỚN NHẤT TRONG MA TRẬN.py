# https://code.ptit.edu.vn/student/question/PY02055
# SỐ NGUYÊN TỐ LỚN NHẤT TRONG MA TRẬN
import math

def isPrime(num):
    if num < 2: return False
    for i in range(2, math.isqrt(num) + 1):
        if num % i == 0: return False
    return True

n, m = map(int, input().split())
mt = []
maxx = 0
for i in range(n):
    line = list(map(int, input().split()))
    for j in range(len(line)):
        if isPrime(line[j]):
            maxx = max(maxx, line[j])
    mt.append(line)
if maxx == 0: print("NOT FOUND")
else:
    print(maxx)
    for i in range(n):
        for j in range(m):
            if mt[i][j] == maxx:
                print(f"Vi tri [{i}][{j}]")