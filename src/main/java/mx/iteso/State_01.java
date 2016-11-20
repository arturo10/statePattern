package mx.iteso;

/**
 * Created by Arturo Hernandez on 17/11/2016.
 */
public class State_01 implements  State {

    public void take(BranchesContext wrapper,boolean bit) {

        if(bit)
            wrapper.setState(new State_10());
        else
            wrapper.setState(new State_00());
    }
}
