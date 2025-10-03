# https://code.ptit.edu.vn/student/question/ICPC0110
# MAX TRIPLE

import sys, heapq

t = int(sys.stdin.readline())
e = -10 ** 9
for _ in range(t):
    n = int(sys.stdin.readline())
    s = sys.stdin.readline()
    n = len(s) // 3
    res = []
    while s[n] != ' ':
        n -= 1
    a = s[:n]
    s = s[n:]
    res += heapq.nlargest(3, a.split())

    n = len(s) // 2
    while s[n] != ' ':
        n -= 1
    res += heapq.nlargest(3, s[:n].split())
    res += heapq.nlargest(3, s[n:].split())
    print(sum(heapq.nlargest(3, res)))
