package mx.iteso;

/**
 * Created by Arturo Hernandez on 17/11/2016.
 */
public class State_00 implements State {

    public void take(BranchesContext wrapper, boolean bit) {

        if(bit)
            wrapper.setState(new State_01());
        else
            wrapper.setState(this);
    }


}
