
public class ParametrosInvalidosExcpetion extends Exception{
    public ParametrosInvalidosExcpetion(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    public ParametrosInvalidosExcpetion(String msg){
        super(msg);
    }
}
