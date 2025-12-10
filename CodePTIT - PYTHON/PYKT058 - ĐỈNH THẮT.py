# https://code.ptit.edu.vn/student/question/PYKT058
# ĐỈNH THẮT

def check(n, i, u, v, ke):
    visited = [False] * (n + 1) 
    visited[i] = True
    stack = [u]
    while stack:
        x = stack.pop()
        if x == v:
            return False
        for j in ke[x]:
            if not visited[j] and j != i:
                visited[j] = True
                stack.append(j)
    return True

for _ in range(int(input())):
    n, m, st, en = map(int, input().split())
    ke = [[] for _ in range(n + 1)]
    for _ in range(m):
        u, v = map(int, input().split())
        ke[u].append(v)
    cnt = 0
    for i in range(1, n + 1):
        if i != st and i != en:
            if(check(n, i, st, en, ke)):
                cnt += 1
    print(cnt)