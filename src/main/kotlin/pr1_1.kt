fun typeconversion(){

    val n: Int =10
    val d: Double=n.toDouble()
    println("Int value : $n")
    println("Double value(from integer) : $d")

    val s: String=n.toString()
    println("String value : $s")
    println("String value1 (From String): $s")
    println("String value2 (From String): $s")
    val s1: String="11.12"
    val d1:Double=s1.toDouble()
    println("Double value (from string) : $d1")


}