package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
/**
 * Created by Arturo Hernandez on 17/11/2016.
 */
public class TestBranchesContext {

    private BranchesContext wrapper;
    private State state;
    @Before
    public void setUp(){
        wrapper=new BranchesContext(true);
    }

    @Test
    public void takeTest(){
       wrapper.setState(new State_00());
        wrapper.change();
        assertTrue(State_01.class.isInstance(wrapper.getState()));
    }
}

