from gettext import find


carro = "Mustang"
fruta = "Laranja"
nome = "Marta de oliveira"

print("A variavel carro tem: ",carro.count("a")," letras A e ", carro.count("i")," letras I")
print("A variavel fruta tem: ",fruta.count("a")," letras A e ", fruta.count("i")," letras I")
print("A variavel nome tem: ",nome.count("a")," letras A e ", nome.count("i")," letras I")

print("A varavel carro tem ",len(carro)," caracteres")
print("A varavel fruta tem ",len(fruta)," caracteres")
print("A varavel nome tem ",len(nome)," caracteres")

print("O A está na posição: ",carro.find("a"),"e o N está na posição: ",carro.find("n"))
print("O A está na posição: ",fruta.find("a"),"e o N está na posição: ",fruta.find("n"))
print("O A está na posição: ",nome.find("a"),"e o N está na posição: ",nome.find("n"))