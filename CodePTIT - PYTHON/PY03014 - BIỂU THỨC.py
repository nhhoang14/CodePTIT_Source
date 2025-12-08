# https://code.ptit.edu.vn/student/question/PY03014
# BIỂU THỨC

for _ in range(int(input())):
    s = input()
    dict = []
    for c in s:
        if c == '(':
            dict.append(0)
            print (len(dict), end=' ')
        elif c == ')':
            for i in range(len(dict) - 1, -1, -1):
                if dict[i] == 0:
                    dict[i] = 1
                    print (i + 1, end=' ')
                    break
    print()