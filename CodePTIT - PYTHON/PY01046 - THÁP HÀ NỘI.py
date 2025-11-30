# https://code.ptit.edu.vn/student/question/PY01046
# THÁP HÀ NỘI

def hanoi(n, tower1, tower3, tower2):
    if n == 1:
        print(f"{tower1} -> {tower3}")
        return
    hanoi(n - 1, tower1, tower2, tower3)
    print(f"{tower1} -> {tower3}")
    hanoi(n - 1, tower2, tower3, tower1)

n = int(input())
hanoi(n, 'A', 'C', 'B')