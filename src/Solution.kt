fun main() {

    val time = ArrayList<Int>()

    time.add(3)
    time.add(3)
    time.add(3)
    time.add(4)
    time.add(4)
    time.add(5)
    time.add(6)
    time.add(6)
    time.add(7)
    time.add(8)


//    time.add(0)
//    time.add(0)
//    time.add(1)
//    time.add(5)

//    time.add(0)
//    time.add(1)
//    time.add(1)
//    time.add(3)
//    time.add(3)
//
//    time.add(0)
//    time.add(26124458)
//    time.add(28798956)
//    time.add(32003819)
//    time.add(33451865)
//    time.add(52784035)
//    time.add(61487256)
//    time.add(62881290)
//    time.add(87876842)
//    time.add(87993396)
//    time.add(93145351)
//    time.add(99138556)
//    time.add(118945925)
//    time.add(133544647)
//    time.add(149796592)
//    time.add(150243766)
//    time.add(152425284)
//    time.add(154700436)
//    time.add(163374140)
//    time.add(170373463)
//    time.add(171517051)
//    time.add(182152198)
//    time.add(188623630)
//    time.add(219070479)
//    time.add(227728689)
//    time.add(235797194)
//    time.add(243066477)
//    time.add(249715604)
//    time.add(250950960)
//    time.add(252565348)
//    time.add(256974246)
//    time.add(257396427)
//    time.add(257933841)
//    time.add(280809251)
//    time.add(283199570)
//    time.add(283215593)
//    time.add(292836807)
//    time.add(297110833)
//    time.add(328641208)
//    time.add(347653696)
//    time.add(356825713)
//    time.add(371777120)
//    time.add(433083860)
//    time.add(438342550)
//    time.add(445168179)
//    time.add(452825361)
//    time.add(454521424)
//    time.add(461728659)
//    time.add(480496944)
//    time.add(482798649)
//    time.add(507121564)
//    time.add(520547257)
//    time.add(543468564)
//    time.add(557450493)
//    time.add(577351361)
//    time.add(586665711)
//    time.add(587237362)
//    time.add(603061062)
//    time.add(615182134)
//    time.add(632532445)
//    time.add(645985918)
//    time.add(646870755)
//    time.add(658234683)
//    time.add(663548377)
//    time.add(674691588)
//    time.add(693464206)
//    time.add(731272574)
//    time.add(732586756)
//    time.add(735642773)
//    time.add(745752868)
//    time.add(762711224)
//    time.add(766324461)
//    time.add(771999273)
//    time.add(780569472)
//    time.add(787122881)
//    time.add(796187508)
//    time.add(817533202)
//    time.add(821622049)
//    time.add(822996946)
//    time.add(838327048)
//    time.add(849473960)
//    time.add(856821665)
//    time.add(864300429)
//    time.add(869790827)
//    time.add(870686685)
//    time.add(877984061)
//    time.add(889843923)
//    time.add(905351809)
//    time.add(913046518)
//    time.add(918457134)
//    time.add(923962352)
//    time.add(935107927)
//    time.add(937186286)
//    time.add(948676954)
//    time.add(969481209)
//    time.add(974429142)
//    time.add(974847631)
//    time.add(975894908)
//    time.add(994074349)
//    time.add(1000000000)


    val direction = ArrayList<Int>()
    direction.add(1)
    direction.add(1)
    direction.add(0)
    direction.add(1)
    direction.add(0)
    direction.add(0)
    direction.add(0)
    direction.add(1)
    direction.add(0)
    direction.add(0)

//        direction.add(0)
//        direction.add(1)
//        direction.add(1)
//        direction.add(0)

//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)

//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(1)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(1)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)
//    direction.add(0)

    val exit = 1
    val enter = 0
    var lastDirection = -1
    var lastSecond = 0
    val arrResult = ArrayList<Int>()
    var lastIterator = -1


    val startTime = System.currentTimeMillis()

    repeat(time.size) { arrResult.add(-1) }


    val arrayTimeLoop = ArrayList<Int>()
    arrayTimeLoop.addAll(time)

    lastIterator = time.min()!! - 1

    for (unitTime in arrayTimeLoop) {
        // Break when all -1
//        if (time.all { it == -1 }) break

        println("Original Time= " + unitTime)
        println("Last Iterator before = " + lastIterator)

        var i = unitTime

        if (lastIterator >= i) {
            lastIterator += 1
            i = lastIterator
        } else {
            lastIterator = i

        }


        println("Enhanced Time= " + i)
        println("Last Iterator after = " + lastIterator)


        val indexesTillCurrentTime = getIndexesTillCurrentTime(time, i)
        if (indexesTillCurrentTime.isEmpty()) {
            continue
        }


        println("indexs = " + indexesTillCurrentTime)

        val directionSublist = ArrayList<Int>()
        indexesTillCurrentTime.forEach { directionSublist.add(direction[it]) }

        println("Sublist = " + directionSublist)

        if (i - lastSecond == 1) {
            if (lastDirection == enter) {
                // Enter priority
                if (directionSublist.any { it == enter }) {
//                    val indexOfFirstEnter = directionSublist.indexOfFirst { it == enter }
                    val indexOfFirstEnter = indexesTillCurrentTime.first { direction[it] == enter }
                    lastDirection = enter
                    lastSecond = i
                    arrResult[indexOfFirstEnter] = i
                    direction[indexOfFirstEnter] = -1
                    time[indexOfFirstEnter] = -1

                } else {
                    val indexOfFirstExit = indexesTillCurrentTime.first { direction[it] == exit }
                    lastDirection = exit
                    lastSecond = i
                    arrResult[indexOfFirstExit] = i
                    direction[indexOfFirstExit] = -1
                    time[indexOfFirstExit] = -1
                }

            } else {
                // Exit Priority
                if (directionSublist.any { it == exit }) {
//                    val indexOfFirstExit = directionSublist.indexOfFirst { it == exit }
                    val indexOfFirstExit = indexesTillCurrentTime.first { direction[it] == exit }
                    lastDirection = exit
                    lastSecond = i
                    arrResult[indexOfFirstExit] = i
                    direction[indexOfFirstExit] = -1
                    time[indexOfFirstExit] = -1

                } else {
                    val indexOfFirstEnter = indexesTillCurrentTime.first { direction[it] == enter }
                    lastDirection = enter
                    lastSecond = i
                    arrResult[indexOfFirstEnter] = i
                    direction[indexOfFirstEnter] = -1
                    time[indexOfFirstEnter] = -1
                }


            }
        } else {
            // Exit priority
            if (directionSublist.any { it == exit }) {
//                val indexOfFirstExit = directionSublist.indexOfFirst { it == exit }
                val indexOfFirstExit = indexesTillCurrentTime.first { direction[it] == exit }
                lastDirection = exit
                lastSecond = i
                arrResult[indexOfFirstExit] = i
                direction[indexOfFirstExit] = -1
                time[indexOfFirstExit] = -1

            } else {
                val indexOfFirstEnter = indexesTillCurrentTime.first { direction[it] == enter }
                lastDirection = enter
                lastSecond = i
                arrResult[indexOfFirstEnter] = i
                direction[indexOfFirstEnter] = -1
                time[indexOfFirstEnter] = -1
            }

        }

        println("RESULT = " + arrResult)

    }



    println("Time in ms: " + (System.currentTimeMillis() - startTime))


}

private fun getIndexesTillCurrentTime(time: ArrayList<Int>, i: Int): ArrayList<Int> {
    val indexTillCurrentTime = ArrayList<Int>()
    time.forEachIndexed { index, element ->

        if (element <= i && element != -1) {
            indexTillCurrentTime.add(index)
        }
    }

    return indexTillCurrentTime
}
