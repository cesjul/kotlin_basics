package basic

fun avg(vararg n: Double): Double{
    var sum: Double = 0.0

    for (i in n){
        sum += i
    }

    return sum / n.size
}

fun main(){
    print(avg(10.0, 10.0, 10.0))
}