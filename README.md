=======
# MMORPG
Desenvolvendo um jogo estilo MMORPG, realizando todo o backEnd em java 
# RPG Console em Java

Projeto de estudo desenvolvido em **Java** com o objetivo de praticar **programação orientada a objetos**, organização de projetos e lógica de jogos.

O jogo é um **RPG simples executado no terminal**, onde o jogador cria um herói, recebe equipamentos iniciais de acordo com sua classe e enfrenta inimigos em um sistema básico de combate.

---

# Funcionalidades atuais

* Criação de personagem
* Sistema de classes

  * Warrior
  * Hunter
  * Mago
  
* Equipamentos iniciais baseados na classe
* Inimigos básicos
* Sistema de combate simples
* Ganho de experiência ao derrotar inimigos

---

# Classes do jogo

Cada classe possui atributos diferentes e equipamentos iniciais próprios.

| Classe  | Equipamento inicial |
| ------- | ------------------- |
| Warrior | Espada e Escudo     |
| Hunter  | Arco e Flechas      |
| Mago    | Cajado              |

---

# Inimigos

Atualmente o jogo possui:

* Caranguejo

Sistema preparado para expansão com novos inimigos como:

* Rato
* Lobo
* Goblin
* Múmia
* Orc
* Vampiro
* Demônio

---

# Sistema de combate

O combate acontece em turnos:

1. O herói ataca
2. O inimigo recebe dano
3. O inimigo ataca
4. O herói recebe dano
5. O combate continua até alguém morrer

Fórmula básica de dano:

```
dano = ataque - defesa
```

Sempre garantindo **dano mínimo de 1**.

---

# Estrutura do projeto

```
>>>>>>> 89823e9f8d78c512c1611642e935943e518e7bca
src
├ personagem
│ └ Heroi.java
│
├ inimigos
│ └ Caranguejo.java
│
├ combate
│ └ SistemaCombate.java
│
└ Main.java
<<<<<<< HEAD
Objetivo do projeto
Este projeto foi criado para:

praticar Java
aprender orientação a objetos
construir projetos para portfólio
desenvolver a lógica base de um RPG
Melhorias planejadas
Sistema de inventário
Sistema de loot
Mais inimigos
Sistema de níveis
Mapa e exploração
Interface mais interativa no terminal
Como executar
Clone o repositório
git clone https://github.com/seuusuario/seu-repositorio.git
Compile o projeto
javac Main.java
Execute
java Main
Tecnologias utilizadas
Java
Programação Orientada a Objetos (POO)
Autor
Projeto desenvolvido como estudo e prática de desenvolvimento em Java.
=======
```

---

# Objetivo do projeto

Este projeto foi criado para:

* praticar **Java**
* aprender **orientação a objetos**
* construir projetos para **portfólio**
* desenvolver a lógica base de um **RPG**

---

# Melhorias planejadas

* Sistema de inventário
* Sistema de loot
* Mais inimigos
* Sistema de níveis
* Mapa e exploração
* Interface mais interativa no terminal

---

# Como executar

1. Clone o repositório

```
git clone https://github.com/seuusuario/seu-repositorio.git
```

2. Compile o projeto

```
javac Main.java
```

3. Execute

```
java Main
```

---

# Tecnologias utilizadas

* Java
* Programação Orientada a Objetos (POO)

---

# Autor

Projeto desenvolvido como estudo e prática de desenvolvimento em Java.
>>>>>>> 89823e9f8d78c512c1611642e935943e518e7bca
