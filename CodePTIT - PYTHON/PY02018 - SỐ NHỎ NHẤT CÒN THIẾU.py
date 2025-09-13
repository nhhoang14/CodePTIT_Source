# https://code.ptit.edu.vn/student/question/PY02018
# SỐ NHỎ NHẤT CÒN THIẾU

n = int(input())
arr = list(map(int, input().split()))
arr.sort()
if arr[0] > 1:
    print(1)
else:
    found = False
    for i in range(n - 1):
        if arr[i + 1] - arr[i] > 1:
            print(arr[i] + 1)
            found = True
            break
    if not found:
        print(arr[n - 1] + 1)