value = input("Digite algo: ")

print("O tamanho de ",value," é: ",len(value))

print("A frase ",value," tem ",value.count("a")," letras A")
print("A frase ",value," tem ",value.count("i")," letras I")

print("A posição da letra C é",value.find("c"))
print("A posição da letra A é",value.find("a"))

print(value.replace("a", "alt"))
