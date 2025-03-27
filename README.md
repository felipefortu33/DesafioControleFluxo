# Desafio Controle de Fluxo

Este repositório contém a resolução do **Desafio Controle de Fluxo**, proposto como parte do aprendizado de lógica de programação e estrutura de controle em Java.

## 📌 Descrição do Desafio
O desafio consiste em implementar estruturas de controle de fluxo para manipulação de dados e tomada de decisões, utilizando conceitos fundamentais da linguagem Java.

## 🛠️ Tecnologias Utilizadas
- Java 17
- IDE: IntelliJ IDEA / VS Code / Eclipse (escolha sua preferência)
- Git/GitHub para versionamento de código

## 📂 Estrutura do Projeto
```
DesafioControleFluxo/
│-- src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── br/com/desafio/
│   │   │   │   ├── Main.java (Classe principal)
│   │   │   │   ├── ... (Outras classes auxiliares)
│   ├── test/ (Testes unitários, se aplicável)
│-- README.md
│-- .gitignore
│-- pom.xml (se for um projeto Maven)
```

## 🚀 Como Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/felipefortu33/DesafioControleFluxo.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd DesafioControleFluxo
   ```
3. Compile e execute o projeto:
   ```bash
   javac src/main/java/br/com/desafio/Main.java
   java -cp src/main/java br.com.desafio.Main
   ```
   Ou, se estiver utilizando uma IDE, basta rodar a classe `Main.java`.

## 📝 Funcionalidades Implementadas
- Estruturas de decisão (`if`, `else if`, `else`, `switch`)
- Laços de repetição (`for`, `while`, `do-while`)
- Tratamento de exceções (`try-catch-finally`)

## 📌 Exemplo de Uso
```java
public class Main {
    public static void main(String[] args) {
        int numero = 10;
        if (numero > 0) {
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo ou zero.");
        }
    }
}
```

## 🤝 Contribuição
Sinta-se à vontade para abrir **issues** e enviar **pull requests** para melhorias no projeto.

## 📜 Licença
Este projeto está sob a licença MIT. Para mais detalhes, consulte o arquivo [LICENSE](LICENSE).

---
📌 Desenvolvido por [Felipe Augusto Ferreira Fortunato](https://github.com/felipefortu33)
