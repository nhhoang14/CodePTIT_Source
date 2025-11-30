# https://code.ptit.edu.vn/student/question/PY01041
# SỐ TĂNG GIẢM

for _ in range(int(input())):
    s = input().strip()
    arr = [int(c) for c in s]
    peak = 0
    while peak + 1 < len(arr) and arr[peak + 1] > arr[peak]:
        peak += 1
    if peak == 0 or peak == len(arr) - 1:
        print("NO")
        continue
    ok = True
    for i in range(peak + 1, len(arr)):
        if arr[i] >= arr[i - 1]:
            ok = False
            break
    print("YES" if ok else "NO")