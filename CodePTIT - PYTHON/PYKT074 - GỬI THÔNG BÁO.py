# https://code.ptit.edu.vn/student/question/PYKT074
# GỬI THÔNG BÁO

for _ in range(int(input())):
    s = input().split()
    res = ""
    for word in s:
        if len(word) + len(res) > 100:
            break
        res += word + " "
    print(res.strip())