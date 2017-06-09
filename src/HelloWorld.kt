fun main(args: Array<String>) {
    println("Hello world!")

    val name:String = "Stas"
    println("My name is $name")

    val javaUser = JavaUser("Java user", 21)
    val kotlinUser = KotlinUser("Kotlin user", 22)

    println("Java user name : ${javaUser.name}")
    println("Kotlin user name : ${kotlinUser.name}")

    println("Сумма равна: ${getSum(3,5)}")
    println("Разность равна: ${getDiv(3,5)}")

    val string:String? = getString()
    val size = string!!.length

    println(Color.BLACK)
    println(Color.BLACK.name)
    println(Color.BLACK.code)

    val color = Color.WHITE;

    var result = when(color) {
        Color.BLACK -> "black"
        Color.RED -> "red"
        else -> "nothing"
    }

    var nums = 1..name.length

    var map = mutableMapOf(Pair(4, "FOUR"))
    map.put(1, "ONE")
    map.put(2, "TWO")
    map.put(3, "THREE")

    for ((k,v) in map) {
        println("Key: $k ; Value: $v")
    }

    val str = "Heloo".addA()
    println(str)

    var nullString: String? = null

    println(nullString?.length ?: "privet. Ya null :)")

    nullString = "Uzhe ne null"
    nullString.let { println("Null string length : $nullString") }

}

fun getSum(a:Int, b:Int): Int {
    return a+b
}

fun getDiv(a:Int, b: Int) = a - b

fun getString() = "hello"

fun String.addA() : String {
    return this + "a"
}