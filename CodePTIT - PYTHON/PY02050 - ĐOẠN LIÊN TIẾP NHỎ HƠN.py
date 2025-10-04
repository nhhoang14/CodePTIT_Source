# https://code.ptit.edu.vn/student/question/PY02050
# ĐOẠN LIÊN TIẾP NHỎ HƠN

for _ in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    res = [0] * n
    st = []
    for i in range(n):
        cnt = 1
        while st and st[-1][0] <= arr[i]:
            cnt += st[-1][1]
            st.pop()
        res[i] = cnt
        st.append((arr[i], cnt))
    print(*res)
