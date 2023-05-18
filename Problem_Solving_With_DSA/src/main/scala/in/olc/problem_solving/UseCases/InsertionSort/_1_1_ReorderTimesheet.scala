package in.olc.problem_solving.UseCases.InsertionSort

/*
 * We are going to use Insertion Sort in this
 * because till a particular date order would have been maintained.
 * After that the array becomes unsorted.
 * And when we have sorted and unsorted sub-arrays in an array, we use Insertion Sort.
*/
object _1_1_ReorderTimesheet {
  case class Entry(date: String, hours:Float)
  def findSortedIndex(arr:Array[Entry]): Int = {
    var idx = 0
    for (i <- 0 until arr.length - 1 if idx == 0) {
      val thisValue = arr(i).date.split("-")(2).toInt
      val nextValue = arr(i + 1).date.split("-")(2).toInt
      if ((nextValue - thisValue) > 1)
        idx = i
    }
    println(s"Array sorted till index: $idx")
    idx
  }
  def insertionSort(arr: Array[Entry]): Array[Entry] = {
    // finding index till where array is sorted
    val idx = findSortedIndex(arr)
    for (i <- idx until arr.length) {
      val temp = arr(i)
      var j = i - 1
      val jDate = arr(j).date.split("-")(2).toInt
      val tempDate = temp.date.split("-")(2).toInt
      while (j >= 0 && jDate > tempDate) {
        arr(j + 1) = arr(j)
        j -= 1
      }
      arr(j + 1) = temp
    }
    arr
  }
  def main(args: Array[String]): Unit = {
    val arrBuffer = scala.collection.mutable.ArrayBuffer[Entry]()
    // Reading file
    val filePath = "Problem_Solving_With_DSA/src/main/resources/datasets/sorting_timesheet.csv"
    val file = scala.io.Source.fromFile(filePath)
    for(line <- file.getLines().drop(1)){
      val values = line.split(",")
      arrBuffer.append(Entry(values(0),values(1).toFloat))
    }
    file.close()

    val timesheetArray = arrBuffer.toArray[Entry]

    val entryArr = insertionSort(timesheetArray).map(value => s"${value.date},${value.hours}")

    entryArr.foreach(println)
  }
}