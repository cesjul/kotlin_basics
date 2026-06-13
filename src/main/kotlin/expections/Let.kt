package expections

fun main() {
    val str: String? = null

    str?.let {
        it.length
    }
}