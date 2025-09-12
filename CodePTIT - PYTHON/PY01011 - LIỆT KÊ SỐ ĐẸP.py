#https://code.ptit.edu.vn/student/question/PY01011
#LIỆT KÊ SỐ ĐẸP

def sinh(n):
    res = []
    digits = ['0', '2', '4', '6', '8']
    for length in range(2, len(str(n)) + 1, 2):
        half = (length + 1) // 2
        for first in digits[1:]:
            def backtrack(pos, cur):
                if pos == half:
                    if length % 2 == 0:
                        s = cur + cur[::-1]
                    else:
                        s = cur + cur[-2::-1]
                    num = int(s)
                    if 22 <= num < n:
                        res.append(num)
                    return
                for d in digits:
                    backtrack(pos + 1, cur + d)
            backtrack(1, first)
    return sorted(res)

for _ in range(int(input())):
    n = int(input())
    ans = sinh(n)
    print(*ans)