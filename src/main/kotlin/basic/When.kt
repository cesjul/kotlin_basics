package basic

fun main(){
    val enter: Int = readln().toInt()

    val output: String =  when (enter){
                            1 -> {"is 1"}
                            else -> {"None"}
                            }
    print(output)
}