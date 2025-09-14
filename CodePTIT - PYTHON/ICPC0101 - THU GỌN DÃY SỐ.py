# https://code.ptit.edu.vn/student/question/ICPC0101
# THU GỌN DÃY SỐ

n = int(input())
arr = list(map(int, input().split()))
i = 0
while i < len(arr) - 1:
    if (arr[i] + arr[i + 1]) % 2 == 0:
        del arr[i:i+2]
        i -= 1
        if i < 0:
            i = 0
    else:
        i += 1
print(len(arr))