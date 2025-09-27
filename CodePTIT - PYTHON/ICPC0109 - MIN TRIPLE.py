# https://code.ptit.edu.vn/student/question/ICPC0109
# MIN TRIPLE

import sys
import heapq
import re

for _ in range(int(sys.stdin.readline())):
    n = int(sys.stdin.readline())
    line = ' ' + input().replace(' ', '  ') + ' '
    a = []
    i = -4
    while i < 5 and len(a) < 4:
        s = '\d' * abs(i) + ' '
        if i < 0:
            s = '-' + s
        elif i > 0:
            s = ' ' + s
        else:
            i += 1
            continue
        a += [int(x) for x in re.findall(s, line)]
        i += 1
    print(sum(heapq.nsmallest(3, a)))