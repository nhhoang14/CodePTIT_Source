# https://code.ptit.edu.vn/student/question/PY02003
# DÃY SỐ HAMMING

def generate_hamming(limit):
    hamming = [1]
    i2 = i3 = i5 = 0

    while True:
        next_val = min(hamming[i2] * 2, hamming[i3] * 3, hamming[i5] * 5)
        if next_val > limit:
            break
        hamming.append(next_val)
        if next_val == hamming[i2] * 2:
            i2 += 1
        if next_val == hamming[i3] * 3:
            i3 += 1
        if next_val == hamming[i5] * 5:
            i5 += 1
    return {val: idx + 1 for idx, val in enumerate(hamming)}


limit = 10 ** 18
hamming_dict = generate_hamming(limit)

t = int(input())
for _ in range(t):
    n = int(input())
    print(hamming_dict.get(n, "Not in sequence"))
