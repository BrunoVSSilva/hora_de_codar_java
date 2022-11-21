import java.util.Scanner;

// 1 - Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão". Exiba o valor para o usuário.

/*
class Main {
  public static void main(String[] args) {
    String planeta = "Plutão";

    System.out.println(planeta);
  }
}
*/

//2 - Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

/*
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe seu nome meu rei");

    String nome = ler.nextLine();
    System.out.println("Olá, " + nome);
  }
}
*/

//3 - Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

/*
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe seu nome meu rei");
    String nome = ler.nextLine();
    
    System.out.println("Informe sua idade meu rei");
    int numero = ler.nextInt();
    
    System.out.println("Olá, " + nome + " sua idade é " + numero);
  }
}
*/

//4 - Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo. 


/*  //Quadrado
class Main {
  public static void main(String[] args) {

    Scanner lados = new Scanner(System.in);
    System.out.println("Informe o valor do lado: ");
    
    double lado = lados.nextDouble();
    System.out.println("valor da área: " + lado*lado);

    
  }
}
*/

/*  // Retangulo
class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o valor do base: ");
    double base = ler.nextDouble();
    System.out.println("Informe o valor do altura: ");
    double altura = ler.nextDouble();
    
    
    System.out.println("valor da área: " + base*altura);

    
  }
}
*/

/*  //Losango
class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o valor da diagonal maior: ");
    double diagonal1 = ler.nextDouble();
    System.out.println("Informe o valor da diagonal menor: ");
    double diagonal2 = ler.nextDouble();
    
    
    System.out.println("valor da área: " + diagonal1*diagonal2/2);

    
  }
}
*/

/* //Trapézio
class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o valor da base maior: ");
    double base1 = ler.nextDouble();
    System.out.println("Informe o valor da menor menor: ");
    double base2 = ler.nextDouble();
    System.out.println("Informe o valor da altura");
    double altura = ler.nextDouble();
    
    
    System.out.println("valor da área: " + (base1*base2)*altura/2);

    
  }
}
*/

/* // Paralelogramo
class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o valor do base: ");
    double base = ler.nextDouble();
    System.out.println("Informe o valor do altura: ");
    double altura = ler.nextDouble();
    
    
    System.out.println("valor da área: " + base*altura);

    
  }
}
*/


/* // Triangulo
class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o valor da diagonal maior: ");
    double base = ler.nextDouble();
    System.out.println("Informe o valor da diagonal menor: ");
    double altura = ler.nextDouble();
    
    
    System.out.println("valor da área: " + base*altura/2);

    
  }
}
*/
/* // Círculo
class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o raio do círculo: ");
    double raio = ler.nextDouble();

    System.out.println("A área do círculo é " + Math.PI*(raio*raio));
  }
}
*/

/* 5.Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.

class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Insira um valor: ");

    double valor = ler.nextDouble();

    if(valor < 0){
      System.out.println("O número " + valor + " é menor negativo");
    }
        else if (valor == 0){
        System.out.println("O número " + valor + " é igual a zero");
    }
          else{
          System.out.println("O número " + valor + " é maior que zero");
            
    }
  }
}

// 6.Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 
/*
class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Insira o primeiro valor: ");
    double a = ler.nextDouble();

    System.out.println("Insira o segundo valor: ");
    double b = ler.nextDouble();

    System.out.println("Insira o terceiro valor: ");
    double c = ler.nextDouble();

    double resultado = Math.max(a, Math.max(b, c));
    System.out.println("O maior número é " + resultado);
  }
}

// 7.Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 

/*
class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);


    System.out.println("Insira o primeiro valor: ");
    double a = ler.nextDouble();

    System.out.println("Insira o segundo valor: ");
    double b = ler.nextDouble();

    System.out.println("Insira o terceiro valor: ");
    double c = ler.nextDouble();

    if(a < b && b < c){
      System.out.println("O maior número é " + (b + c));
    }
    else if(b < a && a < c){
      System.out.println("O maior número é " + (c + a));
    }
    else if(c < a && a < b){
      System.out.println("O maior número é " + (a + b));
    }
  }
}

// 8.Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 
/*
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Insira o primeiro valor");
    double a = ler.nextDouble();
    System.out.println("Insira o primeiro valor");
    double b = ler.nextDouble();

    while(b <= 0){
      System.out.println("O valor não pode ser igual ou menor que zero, por favor insira novamente:");
      b = ler.nextDouble();
      
    }
    System.out.println("A divisão entre os dois valores é " + a/b);
  }
}
*/

//9 - Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

/*
public class Main{
  public static void main (String[] args){

    Scanner ler = new Scanner(System.in);

    System.out.println("Insira 10 valores");
    double a = ler.nextDouble();

    double acum = 0;
    System.out.println(a);

    while(acum <= 9){
      acum++;
      a = ler.nextDouble();
      System.out.println(a);
        
    }    
  }
}
*/

//10 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

/*
public class Main{
 * public static void main(String [] args){
 * 
 * Scanner ler = new Scanner(System.in);
 * 
 * char outro = 'n';
 * 
 * while(outro == 'n'){
 * 
 * System.out.println("Insira o nome do aluno");
 * String nome = ler.nextLine();
 * 
 * System.out.println("Insira a primeira nota");
 * double n1 = ler.nextDouble();
 * 
 * System.out.println("Insira a segunda nota");
 * double n2 = ler.nextDouble();
   
* System.out.println("Insira a terceira nota");
 * double n3 = ler.nextDouble();
 * 
 * System.out.println("Insira a quarta nota");
 * double n4 = ler.nextDouble();
   
 * 
 * double media = ( (n1+n2+n3+n4) /4 );
 * 
 * if(media >= 6.0){
 * System.out.println("O aluno " + nome + " passou :)");
 * } else {
 * System.out.println("O aluno " + nome + " reprovou :(");
 * }
*/

// 11  - Crie uma bomba relógio (usando somente código - para deixar claro!) cuja
// contagem regressiva vá de 30 a 0. Utilize "document.write" para escrever em
// tela e no final da repetição escreva "EXPLOSÃO".
/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * Scanner ler = new Scanner(System.in);
 * int i = 30;
 * 
 * while(i > 0){
 * System.out.println(i--);
 * }
 * 
 * System.out.println("EXPLOSÃO")
 * }
 * 
 * }
 */

// 12  - Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10
// (inclusive) em ordem decrescente.
/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * Scanner ler = new Scanner(System.in);
 * int i = 10;
 * 
 * while(i > 0){
 * System.out.println(i--);
 * }
 * 
 * }
 * 
 * }
 */

// 13 - Faça um algoritmo que calcule e escreva a média aritmética dos dois
// números inteiros informados pelo usuário e todos os números inteiros entre
// eles. Considere que o primeiro sempre será menor que o segundo.

/*
 * class Main {
 * public static void main(String[] args){
 * Scanner ler = new Scanner (System.in);
 * 
 * System.out.println("Informe o valor que irá iniciar a contamgem: ");
 * int comeco = ler.nextInt();
 * int acumuladora = 0;
 * int contador = 0;
 * System.out.println("Informe o valor que irá finalizar a contamgem: ");
 * int fim = ler.nextInt();
 * 
 * while(comeco <= fim){
 * comeco++;
 * acumuladora += comeco;
 * contador++;
 * }
 * System.out.println("A média é :" + acumuladora/contador);
 * }
 * }
 */

/*
// 14  - Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a
// média final. Considere que a nota de aprovação é 6,5. Logo após escrever a
// mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta.
// Se a resposta for "S", o programa deve ser executado novamente, caso
// contrário deve ser encerrado exibindo a quantidade de alunos aprovados.
/*
 * 
 * public class Main{
 * public static void main(String [] args){
 * 
 * Scanner ler = new Scanner(System.in);
 * 
 * char outro = 'n';
 * 
 * while(outro == 'n'){
 * 
 * System.out.println("Insira o nome do aluno");
 * String nome = ler.nextLine();
 * 
 * System.out.println("Insira a primeira nota");
 * double n1 = ler.nextDouble();
 * 
 * System.out.println("Insira a segunda nota");
 * double n2 = ler.nextDouble();
 * 
 * double media = ( (n1+n2) /2 );
 * 
 * if(media >= 6.5){
 * System.out.println("O aluno " + nome + " passou :)");
 * } else {
 * System.out.println("O aluno " + nome + " reprovou :(");
 * }
 * 
 * //System.out.println(outro.getClass().getSimpleName());
 * System.out.println("Deseja ver outro aluno? sim/não ");
 * 
 * outro = ler.next().charAt(0);
 * }
 * }
 * }
 */