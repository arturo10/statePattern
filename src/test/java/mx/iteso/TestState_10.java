package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Arturo Hernandez on 17/11/2016.
 */
public class TestState_10 {

    private BranchesContext wrapper;
    private State state;
    @Before
    public void setUp(){

        wrapper=new BranchesContext(false);
        state=new State_10();

    }

    @Test
    public void takeTest(){
        wrapper.setState(this.state);
        wrapper.change();
        assertTrue(State_01.class.isInstance(wrapper.getState()));
    }
}
