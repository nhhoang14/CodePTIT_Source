# https://code.ptit.edu.vn/student/question/PY02056
# SỐ THUẬN NGHỊCH LỚN NHẤT TRONG MA TRẬN

def check(num):
    tmp = str(num)
    if len(tmp) < 2: return False
    return tmp == tmp[::-1]

n, m = map(int, input().split())
mt = []
maxx = 0
for i in range(n):
    line = list(map(int, input().split()))
    for j in range(len(line)):
        if check(line[j]):
            maxx = max(maxx, line[j])
    mt.append(line)
if maxx == 0:
    print("NOT FOUND")
else:
    print(maxx)
    for i in range(n):
        for j in range(m):
            if mt[i][j] == maxx:
                print(f"Vi tri [{i}][{j}]")
