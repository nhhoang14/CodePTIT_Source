def check(s):
    if sum(int(i) for i in s) % 10 != 0:
        return "NO"
    for i in range(len(s) - 1):
        if abs(int(s[i]) - int(s[i + 1])) != 2:
            return "NO"
    return "YES"

tc = int(input())
for _ in range(tc):
    s = input()
    print(check(s))