import kotlin.math.sqrt

fun displayEenAndOdd(x : Int, even : Boolean){
    for (i in 0..x){
        if (even){
            println(i * 2)
        }else{
            println(i * 2 + 1)
        }
    }
}

displayEenAndOdd(5, true)
displayEenAndOdd(5, false)

fun fib(x : Int){
    val numbers: MutableList<Int> = mutableListOf()
    for (i in 0..x){
        if (i == 0){
            numbers.add(0)
        }else if (i == 1){
            numbers.add(1)
        }else{
            numbers.add(numbers[i-1] + numbers[i-2])
        }
    }
    println(numbers)
}

fib(10)

fun factoriel(x : Int = 10){
    var fact: Int = 1
    for (i in 1..x){
        fact *= i
    }
    println(fact)

}

factoriel()

fun isFirstNumber(number: Int) : Boolean{
    if (number == 2 || number == 3){
        return true
    }

    if (number < 2 || number % 2 == 0 || number % 3 == 0){
        return false
    }

    for (i in 5..sqrt(number.toDouble()).toInt() step 2){
        if (number % i == 0){
            return false
        }
    }
    return true
}

isFirstNumber(29)
isFirstNumber(4)
