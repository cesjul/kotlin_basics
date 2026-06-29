package basic

fun execute(): Nothing{
    throw Exception()
}

fun run(vararg entry: Any): Any {
    val items = entry.size

    return items
}