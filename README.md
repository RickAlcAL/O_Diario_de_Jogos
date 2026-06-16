# Diários de Jogos - Leitor e Gravador de Arquivos

Este é um sistema desenvolvido em Java focado na manipulação de arquivos de texto (`.txt`) utilizando os conceitos de Programação Orientada a Objetos (POO). O programa interage com o usuário via console para receber uma lista de jogos e salvá-los dinamicamente no diretório de sua escolha.

## 🚀 Funcionalidades

* **Definição de Caminho Dinâmico:** O usuário pode digitar o diretório onde deseja que o arquivo seja gerado.
* **Persistência de Dados:** Gravação otimizada de vetores de dados utilizando `BufferedWriter`.
* **Sobrescrita Segura:** O arquivo é atualizado a cada nova execução, evitando duplicações desordenadas.
* **Tratamento de Exceções:** Captura de erros de I/O estruturada para evitar interrupções no sistema.
* **Padronização com Enums:** Uso de Enums para centralizar as mensagens de feedback (sucesso e erro) exibidas no console.

## 📁 Estrutura do Projeto

O projeto está dividido nos seguintes pacotes:

* `Diarios_de_Jogos.Main`: Ponto de entrada do aplicativo (`Main.java`).
* `Diarios_de_Jogos.Menu`: Gerencia a interface de console e a captura das entradas do teclado (`MenuUsuario.java`).
* `Diarios_de_Jogos.SalvarJogos`: Contém a lógica de leitura (`Scanner`) e escrita (`FileWriter`) no arquivo de texto (`SalvarJogos.java`).
* `Diarios_de_Jogos.Enums`: Concentra os estados de execução e mensagens do sistema (`Execoe.java`).

## 🛠️ Como Executar

1. Certifique-se de ter o **Java JDK** instalado em sua máquina.
2. Clone ou baixe os arquivos deste repositório dentro da mesma estrutura de pacotes.
3. Execute a classe `Main.java`.
4. Ao iniciar, digite o caminho de uma pasta válida no seu sistema (Exemplo: `C:\Users\NomeDoUsuario\Documents`).
5. Digite o nome de 5 jogos sequencialmente e observe o arquivo `meus_jogos.txt` ser criado e exibido no console.
