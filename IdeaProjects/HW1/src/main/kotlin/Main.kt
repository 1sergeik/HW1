fun main(){
    println("Видите сумму перевода в рублях")
    val amount_text = readLine() // зарплата в рублях текстом
    val amount = amount_text!!.toInt() // зарплата в рублях числом
    commission(0.75F, 35F, amount)
}
fun commission(commission_percents:Float, min_commission:Float, transfer: Int){

    val b =
        if ((transfer * commission_percents)/100 > min_commission) transfer * commission_percents/100
        else min_commission
    val a = b.toInt()
    println("Комисия при переводе составляет $a Руб")

}