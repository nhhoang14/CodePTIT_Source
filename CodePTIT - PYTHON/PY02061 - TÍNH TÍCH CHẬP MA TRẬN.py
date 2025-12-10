# https://code.ptit.edu.vn/student/question/PY02061
# TÍNH TÍCH CHẶP MA TRẬN

for _ in range(int(input())):
    n, m = map(int, input().split())
    x = [list(map(int, input().split())) for _ in range(n)]
    h = [list(map(int, input().split())) for _ in range(3)]
    sum = 0
    for i in range(1, n - 1):
        for j in range(1, m - 1):
            sum += h[0][0] * x[i-1][j-1]
            sum += h[0][1] * x[i-1][j]
            sum += h[0][2] * x[i-1][j+1]
            sum += h[1][0] * x[i][j-1]
            sum += h[1][1] * x[i][j]
            sum += h[1][2] * x[i][j+1]
            sum += h[2][0] * x[i+1][j-1]
            sum += h[2][1] * x[i+1][j]
            sum += h[2][2] * x[i+1][j+1]
    print(sum)
            