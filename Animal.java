package elsoproject;

public abstract class Animal {
 
       private String nev;
       private int suly;

       protected void makeSound(){
           System.out.println("AAAAA");
       }
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }
        
}
