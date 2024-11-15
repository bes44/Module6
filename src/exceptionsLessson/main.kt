package exceptionsLessson

/*
Создать каталог пользователей вместимостью не более 10 персон.
Она будет содержать функцию приветствия greeting().
Необходимо написать функцию createList(list: Array<String>), в которой нужно вводить имя и фамилию,
предлагать пользователю разместить созданного члена каталога на ту или иную позицию в каталоге list.
Помещать его туда.
Программа должна перехватывать исключения на ввод пустого имени и определения места в каталоге,
которого не существует. Как пожелание, предлагаю написать свой класс исключений, например,
с названием MyException.
* */

fun main() {
    val catalog = UserCatalog()
    catalog.greeting ()
    while (true) {
        catalog.createList()
        println ("Хотите продолжить? (да/нет)")
        val continueInput = readlnOrNull()?.toLowerCase()
        if (continueInput != "да") break
    }
    catalog.printCatalog ()
}