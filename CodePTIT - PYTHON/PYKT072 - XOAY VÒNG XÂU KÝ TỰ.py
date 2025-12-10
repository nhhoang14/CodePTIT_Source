# https://code.ptit.edu.vn/student/question/PYKT072
# XOÁY VÒNG XÂU KÝ TỰ

def rotate_all(x):
    res = []
    for i in range(len(x)):
        res.append(x[i:] + x[:i])
    res.reverse()
    return res

def solve(s):
    tmp = rotate_all(s[0])
    for x in s:
        if x not in tmp:
            print(-1)
            return

    res = 100001
    for target in s:
        base = rotate_all(target)
        steps = 0
        for x in s:
            if x == target:
                continue
            steps += base.index(x) + 1
        res = min(res, steps)
    print(res)

s = []
for _ in range(int(input())):
    s.append(input().strip())
solve(s)