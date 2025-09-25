# https://code.ptit.edu.vn/student/question/PY02020
# TÍNH ĐIỂM TRUNG BÌNH

n = int(input())
arr = list(map(float, input().split()))
minNum, maxNum = max(arr), min(arr)
arr = [x for x in arr if x != minNum and x != maxNum]
total = sum(arr)
print(round(total / len(arr), 2))
