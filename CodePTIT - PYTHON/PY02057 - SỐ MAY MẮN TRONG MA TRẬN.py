# https://code.ptit.edu.vn/student/question/PY02057
# SỐ MAY MẮN TRONG MA TRẬN

n, m = map(int, input().split())
mt = [list(map(int, input().split())) for _ in range(n)]
maxx = max(max(x) for x in mt)
minn = min(min(x) for x in mt)
res = maxx - minn
found = any(res in i for i in mt)
if not found:
    print("NOT FOUND")
else:
    print(res)
    for i in range(n):
        for j in range(m):
            if mt[i][j] == res:
                print(f"Vi tri [{i}][{j}]")
