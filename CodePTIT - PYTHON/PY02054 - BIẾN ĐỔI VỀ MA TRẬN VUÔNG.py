# https://code.ptit.edu.vn/student/question/PY02054
# BIẾN ĐỔI VỀ MA TRẬN VUÔNG

n, m = map(int, input().split())
cnt = abs(n - m)
if n > m:
    for i in range(n):
        line = input()
        if i % 2 == 0 and cnt > 0:
            cnt -= 1
        else:
            print(line)
else:
    for _ in range(n):
        line = input().split()
        tmp = cnt
        res = []
        for i in range(len(line)):
            if i % 2 == 1 and tmp > 0:
                tmp -= 1
            else:
                res.append(line[i])
        print(" ".join(res))


