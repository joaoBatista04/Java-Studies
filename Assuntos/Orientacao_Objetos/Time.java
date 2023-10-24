public class Time {
    private String name;
    private int qntdTitulos;

    public Time(String name, int qntdTitulos){
        this.name = new String();
        
        this.name = name;
        this.qntdTitulos = qntdTitulos;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setQntdTitulos(int qntdTitulos){
        this.qntdTitulos = qntdTitulos;
    }

    public int getTitulos(){
        return this.qntdTitulos;
    }
}
