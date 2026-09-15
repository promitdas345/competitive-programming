N = int(input())

c = []
for i in range(N):
    a, b = map(int,input().split())
    
    if (a ==b):
        c.append(a)
    else:
        for i in range(a,b+1):
            c.append(i)
flag = 0
for i in c:
    if c.count(i) >= N:
        print("gunilla has a point")
        flag = 1
        break
if (not flag):
    print("edward is right")