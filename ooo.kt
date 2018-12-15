val LINE = (1..50).map { '-' }.joinToString(separator = "")

fun main(args: Array<String>) {
    I.willBe().ooo().`for`(5).minutes()
}

class I private constructor(private var minutes: Int? = null) {
    init { println(LINE) }
    companion object { fun willBe() = I() }

    fun ooo() = builderBlock { print("ooo ") }

    fun `for`(minutes: Int) = builderBlock { this.minutes = minutes }

    fun minutes() {
        println("$minutes min")
        println(LINE)
    }

    private fun builderBlock(f: () -> Unit): I {
        f()
        return this
    }
}