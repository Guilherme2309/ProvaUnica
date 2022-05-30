#Author: guilhermevargascarmo@gmail.com


@tag
Feature: Validar fluxo de compra por boleto site Mercado Livre

  @tag1
  Scenario: Validar Fluxo de compra por boleto
    Given que eu acesse o site "https://www.mercadolivre.com.br/"
    And pesquisar o produto 
    And clicar no botao de pesquisa
    When selecionar o produto
    And adicionar ao carrinho
    And logue com usuario e senha
    And comfirmar o endereco 
    And selecionar metodo de pagamento
    Then a compra sera concluida 
    And sera enviado um email de com o boleto da compra