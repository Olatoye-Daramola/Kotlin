fun main(args: Array<String>) {
    // val cloudServices = arrayOf<String>("Microsoft", "Amazon", "Google", "Heroku")

    // println(cloudServices.get(0))
    // println(cloudServices.get(3))

    // cloudServices.set(3, "Digital Ocean")

    // for (i in cloudServices) println(i)

    // println("\nSize of cloudServices is ${cloudServices.size}")
    // println(cloudServices.contentToString())

    // if ("Amazon" in cloudServices) println("Amazon is there") else println("Amazon is not there")

    val names = arrayOf("Seyi", "Tunde", "Wunmi", "Chuks", "Becca", "Tunde")

    val distinctNames = names.distinct()
    for (name in distinctNames) print("\n" + name)

    println()

    val result = names.drop(2)
    for (name in result) print("\n" + name)

    println()

    println("\n" + names.dropLast(2))

    println()

    val products = arrayOf<String>()
    println(products.isEmpty())

    println()
}