# https://code.ptit.edu.vn/student/question/PY02009
# TRÚNG THƯỞNG

for _ in range(int(input())):
    n = int(input())
    freq = {}
    for _ in range(n):
        num = int(input())
        freq[num] = freq.get(num, 0) + 1
    max_freq = max(freq.values())
    ans = min([k for k, v in freq.items() if v == max_freq])
    print(ans)
