package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Arturo Hernandez on 17/11/2016.
 */
public class TestState_01 {

    private BranchesContext wrapper;
    private State state;
    @Before
    public void setUp(){

        wrapper=new BranchesContext(false);
        state=new State_01();

    }

    @Test
    public void takeTest(){
        wrapper.setState(this.state);
        wrapper.change();
        assertTrue(State_00.class.isInstance(wrapper.getState()));
    }
}
