# https://code.ptit.edu.vn/student/question/ICPC0058
# ĐỈNH THẮT

from collections import defaultdict

for _ in range(int(input())):
    n, m, st, en = map(int, input().split())
    dict = defaultdict(list)
    cnt = 0
    for _ in range(m):
        u, v = map(int, input().split())
        dict[u].append(v)
    for x in dict[st]:
        if x in dict[en]:
            cnt += 1
    print(cnt)