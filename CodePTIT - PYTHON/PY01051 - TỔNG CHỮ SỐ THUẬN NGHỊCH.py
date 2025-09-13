# https://code.ptit.edu.vn/student/question/PY01051
# TỔNG CHỮ SỐ THUẬN NGHỊCH

for tc in range(int(input())):
    s = input().strip()
    total = sum(int(ch) for ch in s)

    total_str = str(total)
    if total_str != total_str[::-1] or len(total_str) == 1:
        print("NO")
    else:
        print("YES")