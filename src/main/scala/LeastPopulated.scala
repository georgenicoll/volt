import org.voltdb.VoltProcedure.VoltAbortException
import org.voltdb.{VoltTable, SQLStmt, VoltProcedure}

class LeastPopulated extends VoltProcedure {

  val getLeast = new SQLStmt(
    """SELECT TOP 1 county, abbreviation, population
      |FROM people, states WHERE people.state_num=?
      |AND people.state_num=states.state_num
      |ORDER BY population ASC;""".stripMargin
  )

  @throws(classOf[VoltAbortException])
  def run(state_num: Int): Array[VoltTable] = {
    voltQueueSQL( getLeast, state_num)
    voltExecuteSQL()
  }

}
