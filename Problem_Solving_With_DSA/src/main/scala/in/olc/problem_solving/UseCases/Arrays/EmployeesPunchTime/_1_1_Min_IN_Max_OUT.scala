package in.olc.problem_solving.UseCases.Arrays.EmployeesPunchTime

import java.time.{LocalDateTime, ZoneOffset}
import java.time.format.DateTimeFormatter

object _1_1_Min_IN_Max_OUT {
  private case class Punch(empId: String, punchType: String, time: LocalDateTime)
  def main(args: Array[String]): Unit = {
    val format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    // Punch("EMP008", "in", LocalDateTime.parse("2023-05-08 18:16:21", format)),
    val entryExitArray = Array(
      Punch("EMP021", "in", LocalDateTime.parse("2023-05-08 10:28:18", format)),
      Punch("EMP021", "out", LocalDateTime.parse("2023-05-08 19:27:56", format)),
      Punch("EMP019", "out", LocalDateTime.parse("2023-05-08 19:28:01", format)),
      Punch("EMP004", "in", LocalDateTime.parse("2023-05-08 10:33:22", format)),
      Punch("EMP025", "out", LocalDateTime.parse("2023-05-08 19:05:37", format)),
      Punch("EMP009", "in", LocalDateTime.parse("2023-05-08 09:37:30", format)),
      Punch("EMP019", "in", LocalDateTime.parse("2023-05-08 10:24:55", format)),
      Punch("EMP017", "in", LocalDateTime.parse("2023-05-08 09:44:16", format)),
      Punch("EMP012", "out", LocalDateTime.parse("2023-05-08 18:59:35", format)),
      Punch("EMP009", "out", LocalDateTime.parse("2023-05-08 19:21:06", format)),
      Punch("EMP010", "in", LocalDateTime.parse("2023-05-08 09:30:27", format)),
      Punch("EMP003", "in", LocalDateTime.parse("2023-05-08 09:42:09", format)),
      Punch("EMP025", "in", LocalDateTime.parse("2023-05-08 10:41:57", format)),
      Punch("EMP009", "in", LocalDateTime.parse("2023-05-08 10:59:33", format)),
      Punch("EMP009", "out", LocalDateTime.parse("2023-05-08 18:44:44", format)),
      Punch("EMP010", "out", LocalDateTime.parse("2023-05-08 18:34:12", format)),
      Punch("EMP011", "in", LocalDateTime.parse("2023-05-08 09:48:18", format)),
      Punch("EMP003", "out", LocalDateTime.parse("2023-05-08 18:51:01", format)),
      Punch("EMP013", "in", LocalDateTime.parse("2023-05-08 09:38:57", format)),
      Punch("EMP024", "out", LocalDateTime.parse("2023-05-08 19:02:02", format)),
      Punch("EMP012", "out", LocalDateTime.parse("2023-05-08 19:16:31", format)),
      Punch("EMP022", "out", LocalDateTime.parse("2023-05-08 19:12:03", format)),
      Punch("EMP020", "in", LocalDateTime.parse("2023-05-08 10:18:57", format)),
      Punch("EMP009", "in", LocalDateTime.parse("2023-05-08 10:10:15", format)),
      Punch("EMP011", "in", LocalDateTime.parse("2023-05-08 10:11:48", format)),
      Punch("EMP023", "in", LocalDateTime.parse("2023-05-08 09:49:31", format)),
      Punch("EMP006", "in", LocalDateTime.parse("2023-05-08 09:54:49", format)),
      Punch("EMP004", "in", LocalDateTime.parse("2023-05-08 10:50:55", format)),
      Punch("EMP016", "out", LocalDateTime.parse("2023-05-08 18:34:01", format)),
      Punch("EMP023", "in", LocalDateTime.parse("2023-05-08 10:53:41", format)),
      Punch("EMP004", "out", LocalDateTime.parse("2023-05-08 19:10:09", format)),
      Punch("EMP002", "in", LocalDateTime.parse("2023-05-08 10:00:10", format)),
      Punch("EMP024", "in", LocalDateTime.parse("2023-05-08 10:14:50", format)),
      Punch("EMP023", "out", LocalDateTime.parse("2023-05-08 18:32:09", format)),
      Punch("EMP013", "in", LocalDateTime.parse("2023-05-08 10:43:08", format)),
      Punch("EMP024", "in", LocalDateTime.parse("2023-05-08 10:39:18", format)),
      Punch("EMP010", "out", LocalDateTime.parse("2023-05-08 19:09:39", format)),
      Punch("EMP008", "out", LocalDateTime.parse("2023-05-08 18:51:01", format)),
      Punch("EMP021", "out", LocalDateTime.parse("2023-05-08 19:27:08", format)),
      Punch("EMP004", "out", LocalDateTime.parse("2023-05-08 19:19:35", format)),
      Punch("EMP010", "out", LocalDateTime.parse("2023-05-08 19:20:20", format)),
      Punch("EMP017", "out", LocalDateTime.parse("2023-05-08 19:11:43", format)),
      Punch("EMP023", "in", LocalDateTime.parse("2023-05-08 09:56:33", format)),
      Punch("EMP002", "out", LocalDateTime.parse("2023-05-08 19:03:52", format)),
      Punch("EMP003", "in", LocalDateTime.parse("2023-05-08 10:04:36", format)),
      Punch("EMP003", "in", LocalDateTime.parse("2023-05-08 09:57:10", format)),
      Punch("EMP023", "in", LocalDateTime.parse("2023-05-08 10:16:22", format)),
      Punch("EMP003", "out", LocalDateTime.parse("2023-05-08 18:53:55", format)),
      Punch("EMP002", "out", LocalDateTime.parse("2023-05-08 19:07:31", format)),
      Punch("EMP014", "in", LocalDateTime.parse("2023-05-08 10:02:50", format)),
      Punch("EMP009", "out", LocalDateTime.parse("2023-05-08 18:30:59", format)),
      Punch("EMP019", "in", LocalDateTime.parse("2023-05-08 10:09:02", format)),
      Punch("EMP016", "in", LocalDateTime.parse("2023-05-08 10:26:08", format)),
      Punch("EMP013", "out", LocalDateTime.parse("2023-05-08 18:32:21", format)),
      Punch("EMP025", "out", LocalDateTime.parse("2023-05-08 18:55:22", format)),
      Punch("EMP020", "out", LocalDateTime.parse("2023-05-08 19:09:06", format)),
      Punch("EMP013", "in", LocalDateTime.parse("2023-05-08 10:06:33", format)),
      Punch("EMP017", "out", LocalDateTime.parse("2023-05-08 18:46:24", format)),
      Punch("EMP019", "in", LocalDateTime.parse("2023-05-08 09:36:20", format)),
      Punch("EMP003", "in", LocalDateTime.parse("2023-05-08 09:30:38", format)),
      Punch("EMP013", "out", LocalDateTime.parse("2023-05-08 19:04:18", format)),
      Punch("EMP011", "in", LocalDateTime.parse("2023-05-08 10:07:09", format)),
      Punch("EMP006", "out", LocalDateTime.parse("2023-05-08 18:54:29", format)),
      Punch("EMP023", "in", LocalDateTime.parse("2023-05-08 10:17:24", format)),
      Punch("EMP014", "out", LocalDateTime.parse("2023-05-08 19:05:32", format)),
      Punch("EMP006", "out", LocalDateTime.parse("2023-05-08 18:31:04", format)),
      Punch("EMP009", "in", LocalDateTime.parse("2023-05-08 10:22:26", format)),
      Punch("EMP012", "in", LocalDateTime.parse("2023-05-08 10:33:59", format)),
      Punch("EMP009", "out", LocalDateTime.parse("2023-05-08 18:34:08", format)),
      Punch("EMP019", "in", LocalDateTime.parse("2023-05-08 10:44:45", format)),
      Punch("EMP009", "in", LocalDateTime.parse("2023-05-08 09:50:19", format)),
      Punch("EMP002", "in", LocalDateTime.parse("2023-05-08 09:46:06", format)),
      Punch("EMP009", "in", LocalDateTime.parse("2023-05-08 10:53:52", format)),
      Punch("EMP002", "in", LocalDateTime.parse("2023-05-08 10:47:04", format)),
      Punch("EMP013", "out", LocalDateTime.parse("2023-05-08 19:11:14", format)),
      Punch("EMP008", "in", LocalDateTime.parse("2023-05-08 09:30:52", format)),
      Punch("EMP011", "out", LocalDateTime.parse("2023-05-08 18:46:41", format)),
      Punch("EMP003", "out", LocalDateTime.parse("2023-05-08 18:36:41", format)),
      Punch("EMP022", "in", LocalDateTime.parse("2023-05-08 10:11:58", format)),
      Punch("EMP025", "out", LocalDateTime.parse("2023-05-08 18:59:51", format)),
      Punch("EMP025", "in", LocalDateTime.parse("2023-05-08 10:14:18", format)),
      Punch("EMP014", "out", LocalDateTime.parse("2023-05-08 18:31:36", format)),
      Punch("EMP003", "out", LocalDateTime.parse("2023-05-08 19:19:40", format)),
      Punch("EMP002", "out", LocalDateTime.parse("2023-05-08 19:01:01", format)),
      Punch("EMP013", "in", LocalDateTime.parse("2023-05-08 10:55:01", format)),
      Punch("EMP003", "out", LocalDateTime.parse("2023-05-08 18:59:09", format)),
      Punch("EMP012", "in", LocalDateTime.parse("2023-05-08 09:52:04", format)),
      Punch("EMP004", "out", LocalDateTime.parse("2023-05-08 19:28:12", format))
    )
    val inTimePunches = entryExitArray.filter(elem => elem.punchType == "in")
    val outTimePunches = entryExitArray.filter(elem => elem.punchType == "out")
    val offset = ZoneOffset.of("+05:30")
    val minInTime = inTimePunches.groupBy(_.empId).mapValues(elem => elem.minBy(_.time.toEpochSecond(offset))).mapValues(_.time)
    val maxOutTime = outTimePunches.groupBy(_.empId).mapValues(elem => elem.maxBy(_.time.toEpochSecond(offset))).mapValues(_.time)

    val result = (minInTime.toSeq ++ maxOutTime.toSeq)
      .groupBy(elem => elem._1)
      .mapValues(input => input.map(_._2.format(format)))
      .map{case(id,seq) => s"$id,${seq.mkString(",")}"}

    result.toSeq.sortBy(elem => elem.substring(4, 6)).foreach(println)

    //    val sortedPunches = entryExitArray.groupBy(_.empId).map { case (id, arr) =>
    //      (id,arr.map(p => (p.punchType, p.time)))
    //    }.mapValues(_.sortBy(_._2.toEpochSecond(offset)))
  } //main
}