# https://code.ptit.edu.vn/student/question/PY02029
# BẦU CỬ

def solve(n, m, votes):
    freq = {}
    for vote in votes:
        freq[vote] = freq.get(vote, 0) + 1
    max_votes = max(freq.values())
    res = {k: v for k, v in freq.items() if v != max_votes}
    if not res:
        print("NONE")
        return
    res_max = max(res.values())
    for k in res:
        if res[k] == res_max:
            print(k)
            return

n, m = map(int, input().split())
votes = list(map(int, input().split()))
solve(n, m, votes)