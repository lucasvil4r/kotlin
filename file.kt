fun main() { 
    var idade = 18    
    if( idade>=18){
    println("Adulto")    
    }
}

//---------------------------

fun main() {
    println("Hello, world!!!")
}

//------------------------

fun main(){       
var numero: Double = 3.554525635425    
var numero2: Float = 5.3f       
var numeroInteiro: Int = 10    
var numeroLong: Long = 100000000L        
var resultado: Boolean = false    
    
println(numero)
println(numero2)
println(numeroInteiro)
println(numeroLong)
println(resultado)
    
}

---------------------------

//1) Inicialize duas variáveis, realize a soma e apresente o resultado

fun main(){       
var valor1 = 5
var valor2 = 10
var valor = valor1 + valor2
println(valor)

}

---------------------------

//2) Inicialize duas variáveis, realize a subtração e apresente o resultado

fun main(){       
var valor1 = 5.0
var valor2 = 10
var valor = valor1 - valor2
println(valor)

}

------------------------

//Inicialize duas variáveis com as notas da notaProfessor e da notaProvaGeral do aluno. Apresente em console a seguinte condição. Se uma delas for maior do que 6, a operação deve retornar true, caso contrário deve retornar false.

fun main() {
    val notaProfessor = 7
    val notaProvaGeral = 5
    
    val resultado = notaProfessor > 6 || notaProvaGeral > 6
    
    println(resultado)
}

-------------------------

//7) Inicialize duas variáveis com as notas da notaProfessor e da notaProvaGeral do aluno. Apresente em console a seguinte condição. Se as duas forem maiores do que 6 a operação deve retornar true, caso contrário deve retornar false.

fun main() {   
    var notaProfessor = 5//0-10    
    var notaProvaGeral = 5 //0-10   
    println( notaProfessor >= 6 && notaProvaGeral >= 6 )    
}

//8) Inicialize 3 temperaturas e apresente em console se alguma delas é negativa

fun main(){
    var temp1:Double = -1.0
    var temp2:Double = 3.0
    var temp3:Double = 4.0
        
    if(temp1<0 || temp2<0 || temp3<0){
    print("Uma das temperaturas é negativa")
    }
    else{
    print("Todas as temperaturas são positivas")
    }
}

//9) Inicialize as notas dos alunos, N1 e N2. Verifique se a média das duas é maior do que 6. Se sim, exiba uma mensagem indicando que o aluno foi aprovado. Senão Inicialize uma nova nota N3 e verifique se o aluno foi aprovado.

fun main() {
    val n1 = 7.5
    val n2 = 8.0

    val media = (n1 + n2) / 2

    if (media >= 6) {
        println("Aluno aprovado com média $media")
    } else {
        val n3 = 6.0
        val mediaNova = (n1 + n2 + n3) / 3
        if (mediaNova >= 6) {
            println("Aluno aprovado com média $mediaNova")
        } else {
            println("Aluno reprovado com média $mediaNova")
        }
    }
}
