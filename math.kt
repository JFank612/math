import java.text.DecimalFormat

fun main() {

    var price = 0.00
    var total = 0.00
    val tax = .025
    var taxTotal = 0.00
    var tip = 0.00
    val suggestedTip = .175

    do {

        val format = DecimalFormat("$###,###,###.00")
        val formatPrice = format.format(price)
        val formatTaxTotal = format.format(taxTotal)
        val formatTotal = format.format(total)
        val formatTip = format.format(tip)
        print("Enter the price of the item:")
        val item = readLine()!!.toDouble()
        price = (price + item)
        println(formatPrice)
        println("Type 0 to get total")
        taxTotal = (price * tax)
        total = price + taxTotal
        tip = (suggestedTip * total)



        if (item == 0.00){
            println("Your total before tax is: $formatPrice")
            println("Your tax is: $formatTaxTotal")
            println("Your total after tax is: $formatTotal")
            println("Tip at 17.5% is: $formatTip")
        }



    }while (item != 0.00)
}