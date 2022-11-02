# PySimpleGUI bibliotec || pip install pysimplegui
# Pyperclip bibliotec || pip install pyperclip

import PySimpleGUI as sg
import pyperclip

alphabet = 'abcdefghijklmnopqrstuvwxyz,.?çéãõáâàêèóòô!@#$%¨&*()-_+=° 0123456789'
alphabet2 = '9876543210 ,.?çéãõáâàêèóòô!@#$%¨&*()-_+=°zyxwvutsrqponmlkjihgfedcba'

# Criptografar
def encrypt(message, key):
    key = key.isdigit()
    if key:
        message = message.lower()
        caracter = ''
        for slot in message:
            c_index = alphabet.index(slot)
            caracter += alphabet2[(c_index + key) % len(alphabet)]
        if(event != 'Copiar'):
            msCripto()
        return caracter
    else:
        if(event != 'Copiar'):
            error()
        return ''


# Desencriptografar
def decrypt(message, key):
    key = key.isdigit()
    if key:
        message = message.lower()
        caracter = ''
        for slot in message:
            c_index = alphabet2.index(slot)
            caracter += alphabet[(c_index - key) % len(alphabet)]
        if(event != 'Copiar'):
            msDescripto()
        return caracter
    else:
        if(event != 'Copiar'):
            error()
        return ''

# Interface
def interface():
    sg.theme('DarkBlue')
    layout = [
        [sg.Text(
            'Bem vindo ao sistema de criptografia da guarda costeira brasileira!',
            font=("Helvetica", 21),
            pad=(0, 50)
        )],

        [sg.Image(source="image/logo.png",)],

        [sg.Text(
            'Todo e qualquer contato com a tripulação do seu navio e o lixo toxico será controlado a partir de agora. \nPara se comunicar conosco criptografe e envie a sua mensagem.',
            font=("Arial", 13),
            pad=(0, 50)

        ), ],

        [sg.Button(
            button_text="Cifrar",
            size=(30, 2),
            button_color=('white', '#009444')
        ),

            sg.Button(
                button_text='Decifrar',
                size=(30, 2),
                button_color=('white', '#009444')
        )
        ],
    ]
    return sg.Window('Bem vindo!', size=(1000, 600), element_justification='c', layout=layout, finalize=True)


def criptografar():
    sg.theme('DarkBlue')
    col1 = [
        [sg.Text(
            'Digite a menssagem:',
            font=("Arial", 11),),

         sg.Multiline(
            key='message',
            size=(150, 0), 
            no_scrollbar=True,
            font = ("Arial", 12)
        )],

        [sg.Text(
            'Digite a chave em números:',
            font=("Arial", 11),
        ),

            sg.Multiline(
                key='key',
                size=(150, 0), 
                no_scrollbar=True,
                font = ("Arial", 12)
        )],

        [sg.Button(
            'Voltar',
            size=(15, 1),
            pad=(0, 15),
            button_color=('white', '#009444')
        ),
            sg.Button(
                'Enviar',
                size=(15, 1),
                button_color=('white', '#009444')
        )],
    ]

    layout = [
        [sg.Image(
            source="image/logo100x.png", 
            pad=(0, 40)
            ), 

            sg.Column(col1)
        ],
        
        [sg.Output(
            size=(150, 8),
            font = ("Arial", 15)
        )],

        [sg.Button(
            'Copiar', 
            size=(15, 1), 
            pad=(0, 15),
            button_color=('white', '#009444')
        )],
    ]
    return sg.Window('Criptografar', size=(800, 450), layout=layout, finalize=True)


def desencriptografar():
    sg.theme('DarkBlue')
    col1 = [
        [sg.Text('Digite a menssagem:'), 

         sg.Multiline(
            key='message', 
            size=(150, 0), 
            no_scrollbar=True,
            font = ("Arial", 12)
        )],

        [sg.Text(
            'Digite a chave em números:'
            ),
             
            sg.Multiline(
            key='key',
            size=(150, 0), 
            no_scrollbar=True,
            font = ("Arial", 12)
        )],
        
        [sg.Button(
            'Voltar', 
            size=(15, 1), 
            pad=(0, 15,), 
            button_color=('white', '#009444')
            ), 
            
            sg.Button(
            'Enviar', 
            size=(15, 1), 
            button_color=('white', '#009444')
        )],
    ]
    layout = [
        [sg.Image(
            source="image/logo100x.png",
            ), 
        sg.Column(col1)],
        
        [sg.Output(
            size=(150, 8), 
            font = ("Arial", 15)
        )],

        [sg.Button(
            'Copiar', 
            size=(15, 1), 
            pad=(0, 15),
            button_color=('white', '#009444')
        )],
    ]
    return sg.Window('Desencriptografar', size=(800, 450), layout=layout, finalize=True)


def error():
    sg.theme('DarkBlue')
    return sg.Window('Erro',[
            [sg.Text('Digite uma chave válida!',  font=("Arial", 11), pad=(0, 15),)], 
            [sg.OK(size=(30), pad=(0, 25), button_color=('white', '#009444')), ]
        ], element_justification='c', size=(300, 150)).read(close=True)


def msCripto():
    sg.theme('DarkBlue')
    return sg.Window('Enviada',[
            [sg.Text('Mensagem Criptografada Enviada com sucesso!',  font=("Arial", 11), pad=(0, 15),)], 
            [sg.OK(size=(30), pad=(0, 25), button_color=('white', '#009444')), ]
        ], element_justification='c', size=(350, 150)).read(close=True)

def msDescripto():
    sg.theme('DarkBlue')
    return sg.Window('Enviada',[
            [sg.Text('Mensagem Descriptografada com sucesso!',  font=("Arial", 11), pad=(0, 15),)], 
            [sg.OK(size=(30), pad=(0, 25), button_color=('white', '#009444')), ]
        ], element_justification='c', size=(350, 150)).read(close=True)


# Janelas iniciais
janela1, janela2, janela3, janela4, janela5, janela6 = interface(), None, None, None, None, None

# Loop  de leitura de eventos
while True:
    window, event, values = sg.read_all_windows()
    # Quando janela for fechada
    if window == janela1 and event == sg.WIN_CLOSED:
        break

    if window == janela2 and event == sg.WIN_CLOSED:
        break

    if window == janela3 and event == sg.WIN_CLOSED:
        break
    

    # Ir para próxima janela
    if window == janela1 and event == 'Cifrar':
        janela1.hide()
        janela2 = criptografar()

    if window == janela2 and event == 'Copiar':
        copy = encrypt(values['message'], values['key'])
        pyperclip.copy(copy)

    if window == janela3 and event == 'Copiar':
        copy = decrypt(values['message'], values['key'])
        pyperclip.copy(copy)

    if window == janela1 and event == 'Decifrar':
        janela1.hide()
        janela3 = desencriptografar()

    if window == janela2 and event == 'Voltar':
        janela2.hide()
        janela1.un_hide()

    if window == janela3 and event == 'Voltar':
        janela3.hide()
        janela1.un_hide()

    if window == janela2 and event == 'Enviar':
        # Mandando para função
        print(encrypt(values['message'], values['key']))

    if window == janela3 and event == 'Enviar':
        # Mandando para função
        print(decrypt(values['message'], values['key']))
