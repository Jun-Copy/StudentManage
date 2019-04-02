import com.github.pagehelper.PageInfo;
import com.san.stum.common.Page;
import com.san.stum.entity.GtStudent;
import com.san.stum.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@Test
	public void test1(){
		GtStudent gtStudent = studentService.selectByPrimaryKey(1);
		System.out.println(gtStudent.getStuName());
	}
	@Test
	public void test2(){
		PageInfo<GtStudent> pageInfo = studentService.queryPage(new Page());
		System.out.println(pageInfo);
	}
}
