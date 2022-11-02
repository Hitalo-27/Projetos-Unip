np1 = input("Digite a sua nota da NP1: ")
np2 = input("Digite a sua nota da NP2: ")

final = float(np1) + float(np2)
final = final / 2

if(final<7 and final>=0):
    print("Sua media é:",final,"Você esta reprovado, irá para o exame")
    ex= float(input("Digite a sua nota do Exame: "))
    ex= (final + ex) / 2
    
    if(ex<5 and ex>=0):
        print("Sua media final é:",ex,"Você pegou D.P")

    elif(ex>=5 and ex<=10):
        print("Sua media final é:",ex,"Você passou")

    else: print("Valores do exame inválido")

elif (final >= 7 and final<=10):
    print("Sua media é:",final,"Você esta aprovado")

else: print("Valores invalidos")