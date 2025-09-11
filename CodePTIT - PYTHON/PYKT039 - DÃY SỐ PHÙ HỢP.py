# https://code.ptit.edu.vn/student/question/PYKT039
# DÃY SỐ PHÙ HỢP

def check(n, lst1, lst2):
    lst1.sort()
    lst2.sort()
    for i in range(n):
        if(lst1[i] > lst2[i]):
            return False
    return True

for _ in range(int(input())):
    n = int(input())
    lst1 = list(map(int, input().split()))[:n]
    lst2 = list(map(int, input().split()))[:n]
    if check(n, lst1, lst2):
        print("YES")
    else:
        print("NO")
