# https://code.ptit.edu.vn/student/question/PY02040
# MA TRẬN - 2

n = int(input())
d = 0
for i in range(n):
    row = list(map(int, input().split()))
    d += sum(row[:(n - i)]) - sum(row[(n - i - 1):])
k = int(input())
d = abs(d)
print("YES" if d <= k else "NO")
print(d)
