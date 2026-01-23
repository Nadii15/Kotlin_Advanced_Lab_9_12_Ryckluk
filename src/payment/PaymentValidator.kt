class PaymentValidator{
    fun check(payment: Payment): Boolean{
        return when (payment.type){
            CarType.VISA -> payment.card.length == 16
                    && payment.card.startsWith("4")
            CarType.MASTERCARD -> payment.card.length == 16
                    && payment.card.startsWith("5")
            CarType.MIR -> payment.card.length == 16
                    && payment.card.startsWith("2")
            CarType.UNKNOWN -> payment.card.length == 16

        }&& payment.sum > 0
    }
}

