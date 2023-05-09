package in.olc.problem_solving.LinkedList

class LinkedList{
  private class Node(var value: Int, var nextNode: Option[Node])
  private var head: Option[Node] = None

  def append(elem: Int):Unit = {
    val newNode = Option(new Node(elem, None))
    var node = head
    if(head.isEmpty)
      head = newNode
    else {
      while(node.get.nextNode.isDefined){
        node = node.get.nextNode
      }
      node.get.nextNode = newNode
    }
  }

  def findLength: Int = {
    if(head.isEmpty)
      -1
    else {
      var node = head // 5
      var len = 1
      while (node.isDefined) {
        node = node.get.nextNode // 4
        len += 1 // 4
      }
      len
    }
  }

  def findMiddleElement: Int = {
    var node = head // Node(5)
    val len = findLength match {
      case -1 => return -1
      case _ => math.ceil(findLength/2).toInt
    }
    println(s"the middle position of list is: $len")
    for(_ <- 1 until len){ // 3
      node = node.get.nextNode // Node(25)
    }
    node.get.value
  }

  def show(): Unit = {
    var n = head
    while (n.isDefined) {
      println(n.get.value)
      n = n.get.nextNode
    }
  }
}
object _1_1_FindMiddleOfLinkedList {
  def main(args: Array[String]): Unit = {
    val list = new LinkedList()

    list.append(5)
    list.append(13)
    list.append(25)
    list.append(37)
    list.append(49)

//    println(s"length of list is: ${list.findLength}")

    println(s"Middle element is: ${list.findMiddleElement}")

    list.show()

  }
}
