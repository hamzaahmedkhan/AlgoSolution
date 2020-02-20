fun main() {

    var n = 529

    val binaryString = Integer.toBinaryString(n)

    var biggestGap = 0
    var counter = 0
    var didntFindOne = true

    println(binaryString)

    for (char in binaryString) {

        if (didntFindOne && char == '0') continue

        didntFindOne = false

        if (char == '0') {
            counter += 1

        } else {
            if (counter > biggestGap) {
                biggestGap = counter
            }
            counter = 0
        }


    }

    print(biggestGap)
}