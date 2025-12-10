# https://code.ptit.edu.vn/student/question/PYKT059
# THÀNH PHẦN LIÊN THÔNG

n, m, x = map(int, input().split())
ke = [[] for i in range(n + 1)]
for _ in range(m):
    u, v = map(int, input().split())
    ke[u].append(v)
    ke[v].append(u)
visited = [False] * (n + 1)
visited[x] = True
stack = [x]
while stack:
    top = stack.pop()
    for v in ke[top]:
        if not visited[v]:
            visited[v] = True
            stack.append(v)
for i in range(1, n + 1):
    if not visited[i]:
        print(i)