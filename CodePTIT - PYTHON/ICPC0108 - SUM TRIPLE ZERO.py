# https://code.ptit.edu.vn/student/question/ICPC0108
# SUM TRIPLE ZERO

def solve(lst, n):
    lst.sort()
    cnt = 0
    for i in range(n):
        l, r = i + 1, n - 1
        while l < r:
            s = lst[i] + lst[l] + lst[r]
            if s == 0:
                cnt += 1
                l += 1
            elif s < 0:
                l += 1
            else:
                r -= 1
    return cnt


for _ in range(int(input())):
    n = int(input())
    lst = list(map(int, input().split()))
    print(solve(lst, n))