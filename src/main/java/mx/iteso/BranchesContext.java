package mx.iteso;

/**
 * Created by Arturo Hernandez on 17/11/2016.
 */
public class BranchesContext {

    private State current_state;
    private boolean bit;


    public BranchesContext(boolean bit){
        current_state=new State_00();
        this.bit=bit;

    }

    public void setState(State state){
        current_state=state;
    }

    public void change(){
        current_state.take(this,this.bit);
    }

    public State getState(){
        return current_state;
    }
}
