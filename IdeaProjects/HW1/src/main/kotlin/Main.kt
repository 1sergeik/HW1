const val minCommission = 35// минимальная комиссия константа, потому что используется часто
const val commissionPercentsCardVisaMir = 0.75F // и тут тоже, дальше это значение нам нужно будет сохранить

fun main() {
    val amount = 5_087// зарплата в рублях числом, пока напрямую, у нас нет банка который делал бы перевод, а усложнять задачу не хотели бы
    commissionVisaAndMir(amount) //вызов
}

fun commissionVisaAndMir(transferAmount: Int) { //тут убрали лишние параметры, они не задаются, потому что они изначально установленные

    val result = if ((transferAmount * commissionPercentsCardVisaMir) / 100 > minCommission) transferAmount * commissionPercentsCardVisaMir / 100 else minCommission
    println("Комисия при переводе составляет $result Руб")
    //А так хорошая работа, тут лишь недочеты, например: наименования неправильные, излишества были. Ну и значения было лучше перевести отдельно как константы.
}