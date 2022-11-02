import funcoes

opcao = 0
contatos = funcoes.ler()
while(opcao != 9):
    funcoes.montarMenu()
    opcao = int(input("Digite a sua opção: "))
    print("")
    if(opcao == 1):
        contatos.append(funcoes.entrarDados())

    elif(opcao == 2):
        contatos.append(funcoes.alterar())

    elif(opcao == 3):
        contatos.append(funcoes.excluir())

    elif(opcao == 4):
        funcoes.listar(contatos)

    elif(opcao == 5):
        item = funcoes.entrarDadosBuscar(contatos, "Nome")

    elif(opcao == 6):
        item = funcoes.entrarDadosBuscar(contatos, "Email")

    elif(opcao == 7):
        item = funcoes.entrarDadosBuscar(contatos, "Telefone")

    else:
        print("Opção invalida")

    funcoes.gravar(contatos)
print("FIM")