#language: pt
#encoding: utf-8
#author: Bismark de Carvalho


@Login @BeerOrCoffeeMobile
Funcionalidade: Login Page

  Contexto:
    Dado que estou na tela de login

  Cenario: CT001- Realizar Login com usuario invalido
    Quando informar o email "teste@gmail.com"
    E informar a senha "@1234"
    E clicar no botao ACCESS
    Entao o sistema deve apresentar a seguinte mensagem "Email or password are invalid"

  Cenario: CT002- Realizar Login com usuario e senha em branco
    Quando informar o email ""
    E informar a senha ""
    E clicar no botao ACCESS
    Entao o sistema deve apresentar as seguintes mensagens de erro "Enter a valid email" e "Enter your password"

  Cenario: CT003- Validar Pagina Recuperacao Senha
    E clicar no botao FORGOT YOUR PASSWORD
    Entao o sistema deverar abrir a tela de recuperacao de senha

  Cenario: CT004- Validar Pagina Criacao de Conta
    E clicar no botao CREATE AN ACCOUNT
    Entao o sistema deverar abrir a tela de criacao de conta