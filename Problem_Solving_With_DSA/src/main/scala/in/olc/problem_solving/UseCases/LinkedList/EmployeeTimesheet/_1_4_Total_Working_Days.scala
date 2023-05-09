package in.olc.problem_solving.UseCases.LinkedList.EmployeeTimesheet

import com.opencsv.CSVReaderBuilder

import java.io.{FileNotFoundException, FileReader}
import scala.io.Source

object _1_4_Total_Working_Days {
  def main(args: Array[String]): Unit = {
    val filePath = "Problem_Solving_With_DSA/src/main/resources/datasets/employee_timesheet.csv"
    val missingDatesFilePath = "Problem_Solving_With_DSA/src/main/resources/datasets/missingDates.csv"
    val holidayFile = Source.fromFile("Problem_Solving_With_DSA/src/main/resources/datasets/company_holidays.txt")

    val reader = new CSVReaderBuilder(new FileReader(filePath)).withSkipLines(1).build()

    val missingDataReader = new CSVReaderBuilder(new FileReader(missingDatesFilePath)).withSkipLines(1).build()

    val holidayList = holidayFile.getLines().toList.drop(1)

    holidayFile.close()

    val dateList = new DateList()

    reader.forEach { cols =>
      dateList.append(Employee(cols(0), cols(1), cols(2), cols(3).toInt, cols(4)))
    }

    missingDataReader.forEach{cols =>
      dateList.insertAfter("2023-04-11", Employee(cols(0), cols(1), cols(2), cols(3).toInt, cols(4)))
    }

    dateList.updateWorkingHours("2023-04-17", 10)

    println(s"Total working days = ${dateList.totalWorkingDays(holidayList)}")

//    dateList.show()

  } //main
}