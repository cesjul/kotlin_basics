package basic

fun main(){

    print("Before we proceed, please enter your age: ")
    val ageString: String = readln()

    val ageInt: Int = ageString.toInt()

    if (ageInt !in 18..60){
        println("You are not legal responsible, we cannot go on")
    } else {
        println("Nice to have you with us")
    }


}