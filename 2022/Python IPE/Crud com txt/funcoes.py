def montarMenu():
    menu = [ "1 - Novo",
             "2 - Alterar",
             "3 - Excluir",
             "4 - Listar",
             "5 - Buscar por nome",
             "6 - Buscar por e-mail",
             "7 - Buscar por telefone",
             "9 - Sair",
    ]
    for item in menu:
        print(item)

def entrarDados():
    nome = input("Nome: ")
    email = input("Email: ")
    celular = input("Celular: ")
    contato=[]
    contato.append(nome)
    contato.append(email)
    contato.append(celular)
    return contato

def listar(contatos):
    print("Contato".ljust(35), "Email".ljust(20), "Celular".ljust(20))
    print("-"*35,"-"*20,"-"*20)
    for item in contatos:
        print(item[0].ljust(35), item[1].ljust(20), item[2].ljust(20))

def buscar(contatos, dado):
    item = -1
    for n in range(len(contatos)):
        try:
            if(contatos[n].index(dado) >= 0):
                item = n
                break
        except:
            continue
    return item

def entrarDadosBuscar(contatos, titulo):
    print(titulo+": ", end='')
    dado = input()
    item = buscar(contatos, dado)
    if(item == -1):
        print(titulo, "não encontrado!!!")
    else:
        print(contatos[item])
    return item

def alterar(contatos):
    item = entrarDadosBuscar(contatos, "Nome")
    if(item != -1):
        contato = entrarDados()

        for i in range(len(contato)):
            if len(contato[i] != 0):
                contatos[item][i] = contato[i]
    return contatos

def excluir(contatos):
    item = entrarDadosBuscar(contatos, "Nome")
    contatos = []
    if(item != -1):
        del contatos[item]
    return contatos

def gravar(contatos):
    arquivo = open("contatos.txt", mode="w")
    for item in contatos:
        linha = item[0]+","+item[1]+","+item[2]+"\n"
        arquivo.write(linha)
    arquivo.close()

def ler():
    arquivo = open("contatos.txt", mode="r")
    contatos = []
    linhas = arquivo.readlines()
    for linha in linhas:
        linha = linha.rstrip('\n')
        contato = linha.split(',')
        contatos.append(contato)
    return contatos