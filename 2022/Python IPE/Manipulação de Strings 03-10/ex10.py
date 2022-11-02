value = input("Digite uma frase: ")
value2 = input("Digite outra frase: ")

print("O tamanho da primeira frase é:",len(value),"e da segunda frase é:",len(value2))

print("Existem",value.count("a"),"letras A na primeira frase",value)
print("Existem",value.count("g"),"letras G na primeira frase",value)

print("Existem",value2.count("a"),"letras A na segunda frase",value2)
print("Existem",value2.count("g"),"letras G na segunda frase",value2)

print(value.replace("a", "x1b2"))
print(value2.replace("c", "tt3vy1"))
