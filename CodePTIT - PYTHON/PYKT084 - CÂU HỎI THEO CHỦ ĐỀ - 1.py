# https://code.ptit.edu.vn/student/question/PYKT084
# CÂU HỎI THEO CHỦ ĐỀ - 1

question = {}
last = None
for _ in range(int(input())):
    ip = input()
    if ip == '':
        last = None
        continue
    if last is not None:
        question[last] += 1
    else:
        question[ip] = 0
        last = ip

for cd, q in question.items():
    print(f'{cd}: {q}')
