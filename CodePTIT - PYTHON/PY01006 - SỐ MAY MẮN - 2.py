def check(s):
    for i in s:
        if i != '4' and i != '7':
            print("NO")
            return
    print("YES")

tc = int(input())
for _ in range(tc):
    s = input()
    check(s)