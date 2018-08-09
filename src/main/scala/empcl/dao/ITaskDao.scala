package empcl.dao

import empcl.cases.Task

/**
  * @author : empcl
  * @since : 2018/8/9 17:36 
  */
abstract class ITaskDao {

  /**
    * 根据主键查询任务
    *
    * @param taskId 主键
    * @return 任务
    */
  def findById(taskId: Long): Task

}