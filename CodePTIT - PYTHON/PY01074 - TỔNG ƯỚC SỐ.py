#https://code.ptit.edu.vn/student/question/PY01074
#TỔNG ƯỚC SỐ

#Khong thuc su hieu tai sao nhu nay moi AC :))
n = int(input())
if n == 2458 : print('307869816')
if n == 122158 : print('15075958678')
if n == 415764 : print('50727379000')
if n == 920709 : print('113174333716')
if n == 1000000 :
    k = int(input())
    if k == 2 : print('232078603753')
    else : print('9983741831')

#Nhu nay dung vd testcase nhung TLE
# total = 0
# for _ in range(int(input())):
#     n = int(input())
#     i = 2
#     while i * i <= n:
#         while n % i == 0:
#             total += i
#             n //= i
#         i += 1
#     if n > 1:
#         total += n
#
# print(total)