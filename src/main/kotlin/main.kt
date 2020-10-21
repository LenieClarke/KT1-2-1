fun main() {
    val amount = 100_000
    val minCommission = 3_500
    val commissionOnCard = 0.0075
    val commissionFromAmount = amount * commissionOnCard
    val result = if (commissionFromAmount > minCommission) commissionFromAmount else minCommission
    println("Коммиссия за перевод суммы $amount коп. равна $result коп.")
}