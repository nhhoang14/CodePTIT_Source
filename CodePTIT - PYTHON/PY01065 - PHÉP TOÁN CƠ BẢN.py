# https://code.ptit.edu.vn/student/question/PY01065
# PHÉP TOÁN CƠ BẢN

def check(a, op , b, ans):
    if op == '+': return a + b == ans
    if op == '-': return a - b == ans
    if op == '*': return a * b == ans
    if op == '/': return a % b == 0 and a // b == ans
    return False

def gen_num(n):
    res = []
    if n[0] == '?':
        for i in range(1, 10): res.append(str(i) + n[1:])
    else: res.append(n)
    r = []
    if n[1] == '?':
        for i in res:
            for j in range(0, 10): r.append(i[0] + str(j))
    else: r = res
    return r

def gen_op(x):
    if x == '?': return "+-*/"
    return [x] 

def solve():
    s = input().split()
    a = gen_num(s[0])
    op = gen_op(s[1])
    b = gen_num(s[2])
    ans = gen_num(s[4])
    for i in a:
        for j in op:
            for k in b:
                for m in ans:
                    if(check(int(i), j, int(k), int(m))):
                        print(f'{i} {j} {k} = {m}')
                        return
    print('WRONG PROBLEM!')

for _ in range(int(input())): 
    solve()