# https://code.ptit.edu.vn/student/question/PY02052
# TÍNH CÂN ĐỐI CỦA MA TRẬN - 1

n = int(input())
d = 0
for i in range(n):
    row = list(map(int, input().split()))
    d += sum(row[i + 1:]) - sum(row[:i])
k = int(input())
d = abs(d)
print("YES" if d <= k else "NO")
print(d)
