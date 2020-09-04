//fun addSomeNumbers(x: Int, y: Int): Int{
//    return x + y
//
//}
//
//fun main(){
//    var z = addSomeNumbers(2, 4)
//    println(z)
//}
val pi = 3.14

fun triangle(baseLength: Double, height: Double): Double{
    var area = (baseLength * height) / 2
    return area
}

fun square(sideLength: Double): Double{
    var area = sideLength * sideLength
    return area
}

fun circle(radius: Double): Double{
    var area = pi * (radius * radius)
    return area

}

fun rectangle(width: Double, height: Double): Double{
    var area = width * height
    return area

}

fun main(){
    do{
        println("1. Triangle")
        println("2. Square")
        println("3. Circle")
        println("4. Rectangle")
        println("5. exit")
        print("Select which shape you'd like to calculate the area of: ")
        var shapeChoice = readLine()!!.toInt()
        when (shapeChoice){
            1 -> { println("please enter the necessary measurements to calculate the area")
                print("Base length: ")
                var baseLength = readLine()!!.toDouble()
                print("Height: ")
                var height = readLine()!!.toDouble()
                println(triangle(baseLength, height))
            }
            2 -> {println("please enter the necessary measurements to calculate the area")
                print("Side length: ")
                var sideLength = readLine()!!.toDouble()
                println(square(sideLength))
            }
            3 -> {println("please enter the necessary measurements to calculate the area")
                print("Radius: ")
                var radius = readLine()!!.toDouble()
                println(circle(radius))
            }
            4 -> {println("please enter the necessary measurements to calculate the area")
                print("Width: ")
                var width = readLine()!!.toDouble()
                print("Height: ")
                var height = readLine()!!.toDouble()
                println(rectangle(width, height))
            }
        }
    }while(shapeChoice != 5)
}