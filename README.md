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
<img src="diagrama-microservicos.png" alt="Diagrama de Microsserviços">
Descrição do Diagrama
O diagrama representa a arquitetura do serviço, detalhando os componentes, endpoints, fluxo de solicitações e dependências. Inclui:

Av2IgorApplication: Classe principal que inicia a aplicação Spring Boot.
SecurityConfig: Configurações de segurança, incluindo o filtro de segurança HTTP e a configuração de usuários em memória.
UserController: Controlador REST que gerencia os endpoints de login e acesso baseado em tokens JWT.
UserEntity: Modelo de entidade que representa um usuário.
JwtUtil: Utilitário para geração e extração de informações de tokens JWT.
UserService: Serviço que encapsula a lógica de negócios relacionada aos usuários, incluindo a geração e extração de tokens JWT.
Contato e Plantão
Nome: Igor
E-mail: igor@example.com
Telefone: (00) 0000-0000
Guia de Desenvolvimento
Requisitos
JDK 11 ou superior
Maven 3.6.3 ou superior
