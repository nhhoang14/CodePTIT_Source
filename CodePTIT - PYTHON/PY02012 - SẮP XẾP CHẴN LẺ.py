# https://code.ptit.edu.vn/student/question/PY02012
# SẮP XẾP CHẴN LẺ

n = int(input())
res = []
while len(res) < n:
    line = list(map(int, input().strip().split()))
    res.extend(line)
chan = [i for i in res if i % 2 == 0]
le = [i for i in res if i % 2 != 0]
chan.sort()
le.sort(reverse=True)
c = l = 0
for i in range(n):
    if res[i] % 2 == 0:
        res[i] = chan[c]
        c += 1
    else:
        res[i] = le[l]
        l += 1
print(*res)
