a = "arara"
f = "falcão"
z = "zebra"
m = "arara"

if a == f:
    print("true")
else:
    print("false")

if a != z:
    print("true")
else:
    print("false")

if f == z:
    print("true")
else:
    print("false")

if z != f:
    print("true")
else:
    print("false")

if m == a:
    print("true")
else:
    print("false")

if f == m:
    print("true")
else:
    print("false")

if a < z:
    print("true")
else:
    print("false")

if z < f:
    print("true")
else:
    print("false")

if m > f:
    print("true")
else:
    print("false")

print("A",a,"está no zoológico mais proxima do",f,"do que da",z)