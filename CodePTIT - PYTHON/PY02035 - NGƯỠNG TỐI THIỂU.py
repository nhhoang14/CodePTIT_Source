# https://code.ptit.edu.vn/student/question/PY02035
# NGƯỠNG TỐI THIỂU

s = input()
n = int(input())
if len(s) % 2 != 0:
    s = s[:-1]
freq = {}
for i in range(0, len(s), 2):
    pair = s[i:i+2]
    freq[pair] = freq.get(pair, 0) + 1
ds = sorted([k for k, v in freq.items() if v >= n])
if ds:
    for d in ds:
        print(f'{d} {freq[d]}')
else:
    print("NOT FOUND")

