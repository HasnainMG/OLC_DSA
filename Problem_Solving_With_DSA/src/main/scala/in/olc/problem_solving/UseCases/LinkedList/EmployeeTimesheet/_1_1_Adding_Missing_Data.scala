package in.olc.problem_solving.UseCases.LinkedList.EmployeeTimesheet

import com.opencsv.CSVReaderBuilder

import java.io.FileReader

object _1_1_Adding_Missing_Data {
  def main(args: Array[String]): Unit = {
    val filePath = "Problem_Solving_With_DSA/src/main/resources/datasets/employee_timesheet.csv"
    val missingDatesFilePath = "Problem_Solving_With_DSA/src/main/resources/datasets/missingDates.csv"

    val reader = new CSVReaderBuilder(new FileReader(filePath)).withSkipLines(1).build()

    val missingDataReader = new CSVReaderBuilder(new FileReader(missingDatesFilePath)).withSkipLines(1).build()

    val dateList = new DateList()

    reader.forEach { cols =>
      dateList.append(Employee(cols(0), cols(1), cols(2), cols(3).toInt, cols(4)))
    }

    missingDataReader.forEach{cols =>
      println(cols.mkString("Array(", ", ", ")"))
      dateList.insertAfter("2023-04-11", Employee(cols(0), cols(1), cols(2), cols(3).toInt, cols(4)))
    }
    dateList.show()



  } //main
}