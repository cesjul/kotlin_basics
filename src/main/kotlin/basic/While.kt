package basic

fun main(){
    var keepWhile: Boolean = true
    while (keepWhile){
        print("Which is the secret number? ")

        val input = readln()

        try{
           input.toInt()
        } catch (ex: Exception){
            println("ERROR! $input is not a number, please try again")
            continue
        }
        val inputNumber = input.toInt()

        val secret: Int = (0..9).random()

        if (inputNumber != secret){
            print("Not quite! Press [Y] to try again or [Q] to quit: ")

            when (readln().uppercase()){
                "Y" -> {continue}
                "Q" -> {break}
                else -> {break}
            }
        }

        print("Congrats, you have guessed the secret number: $secret")

        keepWhile = false
    }
}