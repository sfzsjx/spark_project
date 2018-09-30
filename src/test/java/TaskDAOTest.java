import com.gree.cn.dao.ITaskDAO;
import com.gree.cn.dao.factory.DAOFactory;
import com.gree.cn.domain.Task;

/**
 * 任务管理类DAO测试类
 */
public class TaskDAOTest {
    public static void main(String[] args){
        ITaskDAO taskDAO = DAOFactory.getTaskDAO();
        Task task = taskDAO.findById(2);
        System.out.println(task.getTaskid());
    }
}
