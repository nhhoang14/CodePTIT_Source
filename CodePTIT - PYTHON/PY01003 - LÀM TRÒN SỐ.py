#https://code.ptit.edu.vn/student/question/PY01003
#LÀM TRÒN SỐ

tc = int(input())
for _ in range(tc):
    arr = list(int(i) for i in input())
    for i in range(len(arr) - 1, 0, -1):
        if arr[i] >= 5:
            arr[i-1] += 1
        arr[i] = 0
    if arr[0] == 10:
        arr[0] = 0
        arr = [1] + arr
    print(*arr, sep='')