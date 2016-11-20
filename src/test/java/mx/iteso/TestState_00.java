package mx.iteso;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

/**
 * Created by Arturo Hernandez on 17/11/2016.
 */
public class TestState_00 {

    private BranchesContext wrapper;
    private State state;
    @Before
    public void setUp(){

        wrapper=new BranchesContext(true);
        state=new State_00();

    }

    @Test
    public void takeTest(){
        wrapper.setState(this.state);
        wrapper.change();
        assertTrue(State_01.class.isInstance(wrapper.getState()));
    }


}
