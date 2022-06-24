package id.ac.polbeng.zakirahman.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("zakirahman")
    greeter.greet("Budi")
    greeter.text = "Hello"
    println(greeter.with_ret_val("Dono"))
}