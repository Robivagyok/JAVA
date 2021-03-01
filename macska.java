package elsoproject;

public class macska extends Animal{
    
    public macska(){
        
    }
    public macska(String nev){
        this.setNev(nev);
    }
    
    public macska(String nev, int suly){
        this.setNev(nev);
        this.setSuly(suly);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Miau");
    }
}
