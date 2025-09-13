# https://code.ptit.edu.vn/student/question/PY02016
# XUẤT HIỆN NHIỀU LẦN NHẤT

from collections import defaultdict

for _ in range(int(input())):
    n = int(input())
    lst = list(map(int, input().split()))[:n]
    mp = defaultdict(int)
    maxValue = 1
    minKey = lst[0]
    for x in lst:
        mp[x] += 1
        if maxValue < mp[x]:
            maxValue = mp[x]
            minKey = x
        if mp[x] == maxValue:
            minkey = min(minKey, x)

    if maxValue > n/2:
        print(minKey)
    else:
        print("NO")
