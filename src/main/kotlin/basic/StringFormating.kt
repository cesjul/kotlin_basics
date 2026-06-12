package basic

fun main(){
    /*
     %s - String
     %d - Int
     %f - Float
     %c - Char
     %b - Boolean
    */
    
    val name: String = "James"
    val amount: Float = 3498.9048F
    val numberTransactions: Int = 474848

    val welcomeMsg = "Welcome %s!\nYour amount is %,.3f\nYou've made %,d transactions".format("James", amount, numberTransactions)


    print(welcomeMsg)
}