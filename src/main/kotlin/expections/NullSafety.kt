package expections

fun stringIsNumber(string: String): Boolean{
    if (string.isBlank() || string.isEmpty()){
        return false
    }

    return string.all { it.isDigit() }
}

fun main(){

    val str: String? = null

    print(str?.length)
    print(str!!.length)
}