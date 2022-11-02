x = "Teste de string no Python"
y = "Aprendendo a manipular strings com python"
z = "Vamos trabalhar com strings"

print("Existem:",x.count("a"),"letras a\n","Existem:",x.count("i"),"letras i")
print("Existem:",y.count("a"),"letras a\n","Existem:",y.count("i"),"letras i")
print("Existem:",z.count("a"),"letras a\n","Existem:",z.count("i"),"letras i")

print(x.find("p"), x.find("e"))
print(y.find("p"), y.find("e"))
print(z.find("p"), z.find("e"))

print(len(x))
print(len(y))
print(len(z))

print(x.upper())
print(z.upper())

print(y.replace("manipular", "trabalhar"))