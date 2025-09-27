# https://code.ptit.edu.vn/student/question/ICPC0109
# MIN TRIPLE

import heapq

def solve(arr):
    stack = arr[:3]
    for x in arr:
        if stack:
            # xét cặp: số hiện tại với số trên đỉnh stack
            if (stack[-1] + x) % 2 == 0:
                stack.pop()  # bỏ cả 2
            else:
                stack.append(x)  # tổng lẻ thì giữ lại
        else:
            stack.append(x)
    return len(stack)


for _ in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    print(solve(arr))
