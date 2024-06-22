Projeto Av2Igor

Descrição do Microserviço
Este projeto é uma aplicação Spring Boot que implementa um sistema de autenticação e controle de acesso baseado em JWT (JSON Web Token). A aplicação permite o registro de novos usuários, autenticação segura através de login e controle de acesso a diferentes endpoints baseado no tipo de usuário (administrador, gerente de produtos, vendedor ou cliente).

Funcionalidades
Parte 1: Autenticação de Usuários
Registro de Usuário: Permite que novos usuários se cadastrem com nome de usuário, senha e e-mail. Cada usuário é identificado como administrador, gerente de produtos, vendedor ou cliente.
Login Seguro: Sistema de login onde os usuários podem se autenticar utilizando suas credenciais (nome de usuário e senha). As credenciais são verificadas em relação aos dados armazenados no banco de dados.
Geração de Token JWT: Após um login bem-sucedido, gera um token JWT que inclui informações como ID do usuário, tipo de conta e e-mail.
Parte 2: Controle de Acesso com JWT
Administradores: Endpoint para gerenciamento de usuários (criação, atualização e exclusão). Exemplo: POST /admin/users
Gerentes de Produtos: Endpoint para gerenciamento de produtos e categorias. Exemplo: POST /manager/products
Vendedores: Endpoint para gerenciamento de pedidos e devoluções. Exemplo: POST /seller/orders
Clientes: Endpoint para acesso ao catálogo de produtos e histórico de pedidos. Exemplo: GET /customer/products
Endpoints
Registro e Login
POST /cadastrar: Registro de novo usuário.
POST /login: Autenticação do usuário e geração de token JWT.
Controle de Acesso
GET /username/{token}: Extrai o nome de usuário a partir do token JWT.
GET /manager/{token}: Acesso para gerentes de produtos.
GET /admin/{token}: Acesso para administradores.
GET /user/{token}: Acesso para clientes.
Diagrama de Arquitetura

![diagrama1](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/28e41da3-9ac0-4442-a1e7-08facf32691e)


![diagrama2](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/218f7ad5-4089-40b5-9d79-65867a7905b7)


Descrição do Diagrama
O diagrama representa a arquitetura do serviço, detalhando os componentes, endpoints, fluxo de solicitações e dependências. Inclui:

Av2IgorApplication: Classe principal que inicia a aplicação Spring Boot.
SecurityConfig: Configurações de segurança, incluindo o filtro de segurança HTTP e a configuração de usuários em memória.
UserController: Controlador REST que gerencia os endpoints de login e acesso baseado em tokens JWT.
UserEntity: Modelo de entidade que representa um usuário.
JwtUtil: Utilitário para geração e extração de informações de tokens JWT.
UserService: Serviço que encapsula a lógica de negócios relacionada aos usuários, incluindo a geração e extração de tokens JWT.

Requisitos
JDK 17 ou superior
Maven 3.6.3 ou superior

Prints do Funcionamento:

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/02cd5e63-d6b1-4dfc-98dd-923641e106b3)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/346c19bd-ca72-4186-af83-5f9625b417be)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/c06ebc53-ec6b-4b59-b876-ac6932de7a4b)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/084ac460-696f-4d9f-8dfa-314daa932813)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/882b34b0-035d-44dc-83f3-ac8fe4d9bc05)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/5f07b4f6-8bf5-4315-9225-4eac2b50f2f8)




