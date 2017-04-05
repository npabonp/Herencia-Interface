
package EjCientifico;

public class Cientifico {

    private Mode mode;

    public Cientifico() {
        mode = new Write();
    }
    //Lo que el cientifico hace
    public void doing(){
        mode.work();
    }
    public void drink(){
        mode.drink();
    }
    //Cambio de los metodos de mode
    public void setWrite(){
        mode = new Write();
    }
    public void setTeach(){
        mode = new Teach();
    }
    public void setAdministrate(){
        mode = new Admn();
    }
    
    public static void main(String[] args) {
        Cientifico Einstein = new Cientifico();
        Einstein.doing();
        //Ahora el cientifico cambia a Enseñar
        Einstein.setTeach();
        //Lo que hace ahora es enseñar
        Einstein.doing();
        Einstein.drink();
    }
}
