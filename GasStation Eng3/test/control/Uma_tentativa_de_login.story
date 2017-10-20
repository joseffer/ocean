Scenario: Um funcionario eh cadastrado no sistema e tenta efetuar login

Given um usuario com login de admin e senha de admin
When quando digitar admin no campo usuario e senha admin na tela de login
Then deve apresentar a mensagem de sucesso logado

