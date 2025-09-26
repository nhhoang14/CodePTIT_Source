# https://code.ptit.edu.vn/student/question/PY01026
# SẮP ĐẶT LẠI XÂU KÝ TỰ

from collections import Counter

def check(s1, s2):
    return "YES" if Counter(s1) == Counter(s2) else "NO"

for t in range(int(input())):
    s1 = input()
    s2 = input()
    print(f'Test {t+1}: {check(s1, s2)}')
