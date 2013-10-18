import com.labs.jms.MapMessageProducer;
import com.labs.jms.TextMessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:application-context.xml"})
public class ActivemqTest {

    @Autowired
    private TextMessageProducer textMessageProducer;
    @Autowired
    private MapMessageProducer mapMessageProducer;


    @Test
    public void testJMS() {
        textMessageProducer.start();
        mapMessageProducer.start();
    }
}
