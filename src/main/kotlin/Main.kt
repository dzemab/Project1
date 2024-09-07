fun main() {
    val inputVal = "A3DS3R2T2HA4"
    var result = " "

    var countChar = 1
    var previousChar = inputVal[0]

    for (i in 1..inputVal.length - 1) {
        if (inputVal[i] == previousChar) {
            countChar++
        } else {
            if (countChar > 1) {
                result = result + previousChar + countChar
            } else {
                result = result + previousChar
            }
            countChar = 1
            val i = 0
            previousChar = inputVal[i]
        }
    }
    println(result)
}