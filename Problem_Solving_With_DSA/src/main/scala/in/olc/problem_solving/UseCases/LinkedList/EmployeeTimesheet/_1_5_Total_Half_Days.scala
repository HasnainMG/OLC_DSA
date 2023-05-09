package in.olc.problem_solving.UseCases.LinkedList.EmployeeTimesheet

import com.opencsv.CSVReaderBuilder

import java.io.FileReader

object _1_5_Total_Half_Days {
  def main(args: Array[String]): Unit = {
    val filePath = "datasets/employee_timesheet.csv"
    val missingDatesFilePath = "datasets/missingDates.csv"

    val reader = new CSVReaderBuilder(new FileReader(filePath)).withSkipLines(1).build()

    val missingDataReader = new CSVReaderBuilder(new FileReader(missingDatesFilePath)).withSkipLines(1).build()

    val dateList = new DateList()

    reader.forEach { cols =>
      dateList.append(Employee(cols(0), cols(1), cols(2), cols(3).toInt, cols(4)))
    }

    missingDataReader.forEach{cols =>
      dateList.insertAfter("2023-04-11", Employee(cols(0), cols(1), cols(2), cols(3).toInt, cols(4)))
    }

    dateList.updateWorkingHours("2023-04-17", 10)

    val (halfDays, dates) = dateList.totalHalfDays

    println(s"Total number of half days taken: $halfDays")
    println(s"Half day taken on: ${dates.mkString(", ")}")
//    dateList.show()

  } //main
}