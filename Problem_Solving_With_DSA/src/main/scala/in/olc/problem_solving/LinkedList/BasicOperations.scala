package in.olc.problem_solving.LinkedList

class LinkedList_BasicOperations {
  private class Node(val value: Int, var nextNode: Option[Node])
  private var head: Option[Node] = None

  def push(elem: Int): Unit = {
    val newNode = Option(new Node(elem, None))
    newNode.get.nextNode = head
    head = newNode
  }

  def insertAfter(valueToFind: Int, elemToInsert: Int): Unit = {
    //emptyList check
    if (head.isEmpty) {
      println("Can Insert in Empty List")
    }
    else {
      val newNode = Option(new Node(elemToInsert, None))
      var n = head // Node(13,...)
      while (n.get.value != valueToFind) {
        n = n.get.nextNode
      }
      newNode.get.nextNode = n.get.nextNode // Node(17, Node(25, .....))
      n.get.nextNode = newNode
    }
  }

  def append(elem: Int): Unit = {
    val node = Option(new Node(elem, None))
    if(head.isEmpty) {
      head = node
    }
    else{
     var n = head
      while (n.get.nextNode.isDefined) {
        n = n.get.nextNode
      }
      n.get.nextNode = node
    }
  }

  def search(elem: Int): String = {
    var n = head
    var pos = 1
    while (n.get.nextNode.isDefined) {
      if (n.get.value == elem) {
        return s"Element: $elem is present at $pos position"
      }
      n = n.get.nextNode
      pos += 1
    }
    "Element Not Present"
  }

  def deleteElement(elem: Int): Unit = { //elem = 17
    var n = head
    var prevNode:Option[Node] = None
    if(n.get.value == elem){
      n = n.get.nextNode
      head = n
    }
    else {
      while (n.get.value != elem) {
        prevNode = n
        n = n.get.nextNode
      } //prevNode = 13 and n = 17
      prevNode.get.nextNode = n.get.nextNode
      n = prevNode
    }
  }

  def deleteAtPosition(position: Int): Unit = { //4
    var node = head // Node(1,Node(5,...))
    var pos = 1
    var prevNode: Option[Node] = None
    while (pos != position) {
      prevNode = node // Node(13, Node(17,..))
      node = node.get.nextNode //Node(17, Node(25,..))
      pos += 1 //4
    }
    prevNode.get.nextNode = node.get.nextNode // Node(13, Node(25,..))
    node = prevNode
  }



  def show(): Unit = {
    var n = head
    while(n.isDefined){
      println(n.get.value)
      n = n.get.nextNode
    }
  }
}

object BasicOperations {
  def main(args: Array[String]): Unit = {
    val list = new LinkedList_BasicOperations()
    list.append(5)
    list.append(13)
    list.append(25)
    list.append(37)

    list.insertAfter(13, 17)

    list.push(1)

    list.deleteElement(17)

    list.deleteAtPosition(4)

    list.show()

    println(list.search(25))
  }
}
