# https://code.ptit.edu.vn/student/question/PYKT081
# ĐỊA CHỈ IP

def check(lst):
    if len(lst) != 4:
        return "NO"
    for num in lst:
        if num < 0 or num > 255:
            return "NO"
    return "YES"


for _ in range(int(input())):
    try:
        lst = list(map(int, input().split('.')))
        print(check(lst))
    except:
        print("NO")
