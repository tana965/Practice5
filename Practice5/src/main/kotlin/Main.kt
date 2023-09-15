fun main(args: Array<String>) {
    val figures = mutableListOf<ToString>(
        Point(0.0, 0.0),
        ColoredPoint(2.0, 2.0, Color.Blue),
        Line(Point(0.0, 0.0), Point(3.0, 3.0)),
        ColoredLine(Point(1.0, 1.0), Point(2.0, 2.0), Color.Black),
        Polygone(Point(0.0, 0.0), Point(1.0, 1.0), Point(0.0, 1.0)))
    val movePolygon = Polygone(Point(0.0, 0.0), Point(3.0, 0.0), Point(3.0, 2.0), Point(0.0, 2.0))


    println(figures)
    movePolygon.move(4.0,2.0)
    println(movePolygon.toString())

  
}
