
@tag
Feature: Abertura de conta
  

  @tag1
  Scenario: Fluxo do formulario de abertura de conta pessoa Fisica
   Given que o usuario acesse a url "https://www.original.com.br/"
	 And selecione o botao abrir nova  conta
   And selecionar o botao abrir conta para voce
   When o usuario preencher o formulario
   And selecionar o botão quero ser cliente
   Then valido o texto falta pouco