#https://code.ptit.edu.vn/student/question/PY01010
#ĐẦU CUỐI

tc = int(input())
for _ in range(tc):
    s = input()
    length = len(s)
    if s[0] == s[length - 2] and s[1] == s[length - 1]:
        print("YES")
    else:
        print("NO")