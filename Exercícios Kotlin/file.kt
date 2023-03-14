/*1. Inicialize 3 variáveis de tipos de dados inteiros, compare se alguma delas é
maior do que 1000 ou menor do que 100. Exiba qual é a variável que está
dentro do range. */

fun main() {
    // inicializando três variáveis inteiras
    val a = 500
    val b = 1200
    val c = 50

    // verificando se alguma delas está dentro do range desejado
    val range = 100..1000 // definindo o range desejado como uma constante
    when {
        a in range -> println("a está dentro do range")
        b in range -> println("b está dentro do range")
        c in range -> println("c está dentro do range")
        else -> println("Nenhuma das variáveis está dentro do range")
    }
}

/*2. Inicialize dois valores, calcule e apresente a diferença do maior pelo menor. */

fun main() {
    // inicializando dois valores
    val a = 10
    val b = 5

    // calculando a diferença do maior pelo menor
    val diff = maxOf(a, b) - minOf(a, b)

    // apresentando o resultado
    println("A diferença entre $a e $b é $diff")
}

/*3. Inicialize as notas dos alunos, N1, N2 e N3. Verifique se a média das três é
maior do que 6. Se sim, exiba uma mensagem indicando que o aluno foi
aprovado. Senão Inicialize uma nova nota N4 e verifique se o aluno foi
aprovado. */

fun main() {
    // Inicializando as notas N1, N2 e N3
    val N1 = 7.5
    val N2 = 8.0
    val N3 = 6.5

    // Calculando a média das notas
    val media = (N1 + N2 + N3) / 3

    // Verificando se a média é maior ou igual a 6
    if (media >= 6) {
        println("Aluno aprovado com média $media")
    } else {
        // Solicitando a entrada da nota N4
        print("Informe a nota N4: ")
        val N4 = readLine()?.toDoubleOrNull()

        // Verificando se a nota N4 é válida
        if (N4 != null) {
            // Recalculando a média das notas com a nota N4
            val mediaNova = (N1 + N2 + N3 + N4) / 4

            // Verificando se a nova média é maior ou igual a 6
            if (mediaNova >= 6) {
                println("Aluno aprovado com média $mediaNova")
            } else {
                println("Aluno reprovado com média $mediaNova")
            }
        } else {
            println("Nota inválida, por favor tente novamente.")
        }
    }
}


/*4. Inicialize uma variável contendo o salário atual e outra variável contendo a
opção que será acessada no menu. Para opção 1 deve ser acrescido 30% no
salário, para opção 2 deve ser acrescido 40% no salário, para opção 3 deve ser
acrescido 50% no salário e para a opção 4 deve ser acrescido 60% no salário.
Exiba o valor reajustado. */

fun main() {
    // Inicializando as variáveis com o salário atual e a opção do menu
    var salarioAtual = 3000.0
    var opcaoMenu = 1

    // Verificando a opção do menu selecionada e aplicando o reajuste correspondente
    when (opcaoMenu) {
        1 -> salarioAtual *= 1.3
        2 -> salarioAtual *= 1.4
        3 -> salarioAtual *= 1.5
        4 -> salarioAtual *= 1.6
        else -> println("Opção inválida")
    }

    // Exibindo o valor reajustado do salário
    println("Novo salário: $salarioAtual")
}


/*5. Calcule e mostre o quadrado dos números entre 40 e 200 dos números
inteiros pares. */

fun main() {
    for (i in 40..200 step 2) {
        val quadrado = i * i
        println("$i ao quadrado = $quadrado")
    }
}

/*6. Calcule e mostre a soma dos números pares e quantidade de números
ímpares entre 1 e 800. */

fun main() {
    var somaPares = 0
    var countImpares = 0

    for (i in 1..800) {
        if (i % 2 == 0) {
            somaPares += i
        } else {
            countImpares++
        }
    }

    println("Soma dos números pares: $somaPares")
    println("Quantidade de números ímpares: $countImpares")
}

/*7. Inicialize um número que conterá o final da iteração. Apresente em console
todos os valores de 1 ao número inicializado que são divisíveis por 5. */

fun main() {
    val numero = 30

    for (i in 1..numero) {
        if (i % 5 == 0) {
            println(i)
        }
    }
}
