package in.olc.problem_solving.UseCases.LinkedList.EmployeeTimesheet

import scala.collection.mutable.ListBuffer

case class Employee(var empId: String, var projectName: String, var task: String, var workingHours: Int, var date: String)
class DateList{

  private class Node(var empData: Employee, var nextNode: Option[Node])

  private var head: Option[Node] = None

  def append(data: Employee): Unit = {
    val newNode = Option(new Node(data, None))
    if(head.isEmpty)
      head = newNode
    else {
      var n = head
      while (n.get.nextNode.isDefined) {
        n = n.get.nextNode
      }
      n.get.nextNode = newNode
    }
  }

  def insertAfter(date: String, empData: Employee): Unit = {
    val newNode = Option(new Node(empData, None))
    var currentNode = head
    while(currentNode.get.empData.date != date){
      currentNode = currentNode.get.nextNode
    }
    newNode.get.nextNode = currentNode.get.nextNode
    currentNode.get.nextNode = newNode
  }

  def updateWorkingHours(date: String, hours: Int): Unit = {
    var currentNode = head
    while (currentNode.get.empData.date != date) {
      currentNode = currentNode.get.nextNode
    }
    currentNode.get.empData.workingHours = hours
  }

  def longestWorkingDay: (String, Int) = {
    var currentNode = head
    var minValue = Integer.MIN_VALUE
    var returnDate = ""
    while (currentNode.get.nextNode.isDefined) {
      if (currentNode.get.empData.workingHours > minValue) {
        minValue = currentNode.get.empData.workingHours
        returnDate = currentNode.get.empData.date
      }
      currentNode = currentNode.get.nextNode
    }
    (returnDate,minValue)
  }

  def totalHalfDays: (Int, List[String]) = {
    var node = head
    val list = ListBuffer[String]()
    var numDays = 0
    while(node.get.nextNode.isDefined){
      if(node.get.empData.workingHours < 5){
        numDays += 1
        list.append(node.get.empData.date)
      }
      node = node.get.nextNode
    }
    (numDays, list.toList)
  }

  def totalWorkingDays(holidaysList: List[String]): Int = {
    var node = head
    var leaveDays = 0
    val weekends = 8
    var holidays = 0
    while(node.get.nextNode.isDefined){
      if(node.get.empData.workingHours == 0 && !holidaysList.contains(node.get.empData.date)){
        leaveDays += 1
      }
      if(holidaysList.contains(node.get.empData.date)){
        holidays += 1
      }
      node = node.get.nextNode
    }
    30 - weekends - leaveDays - holidays
  }

  def overTimePay: Float = {
    var node = head
    var overTimeHours = 0
    while(node.get.nextNode.isDefined){
      if(node.get.empData.workingHours > 8){
        overTimeHours += node.get.empData.workingHours - 8
      }
      node = node.get.nextNode
    }
    val perHourPay = 50000/30/8
    val overTimePayment = overTimeHours * (perHourPay * 1.5)
    overTimePayment.toFloat
  }

  def show(): Unit = {
    var node = head
    while(node.isDefined){
      println(node.get.empData)
      node = node.get.nextNode
    }
  }
}
