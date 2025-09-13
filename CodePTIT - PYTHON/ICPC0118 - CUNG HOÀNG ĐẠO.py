# https://code.ptit.edu.vn/student/question/ICPC0118
# CUNG HOÀNG ĐẠO

zodiac = [
    (20, "Ma Ket", "Bao Binh"),
    (19, "Bao Binh", "Song Ngu"),
    (21, "Song Ngu", "Bach Duong"),
    (20, "Bach Duong", "Kim Nguu"),
    (21, "Kim Nguu", "Song Tu"),
    (21, "Song Tu", "Cu Giai"),
    (23, "Cu Giai", "Su Tu"),
    (23, "Su Tu", "Xu Nu"),
    (23, "Xu Nu", "Thien Binh"),
    (23, "Thien Binh", "Thien Yet"),
    (23, "Thien Yet", "Nhan Ma"),
    (22, "Nhan Ma", "Ma Ket")
]

for _ in range(int(input())):
    d, m = map(int, input().split())
    day, zodiac_before, zodiac_after = zodiac[m - 1]
    if d < day:
        print(zodiac_before)
    else:
        print(zodiac_after)