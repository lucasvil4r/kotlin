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
