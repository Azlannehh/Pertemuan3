package id.ac.polbeng.zakirahman.test_kelas

fun main() {
    val meri = Student("Muhamad Zaki R", 20)
    // Destructuring Declaration with componentN() method
    val name = meri.component1()
    val age = meri.component2()
    println("Name = $name")
    println("Age = $age")
}