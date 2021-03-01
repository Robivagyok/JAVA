package sb;

public class SB {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abrakadabra");
         sb.charAt(3); //4. karakter
         sb.charAt(0); //1. (Üres StringBuildnél indexelési hiba
         sb.charAt(sb.length()-1);//utolsó karakter
         
         System.out.println(sb.length());
         System.out.println(sb.indexOf("rak")); //2
         //A 2. indexű (3.karakternél) található a rak szócska.
         
         System.out.println(sb.indexOf("br"));//1
         /*Az 1. indexű (2.karakternél) található a rak szócska
          *Fontos, hogy az indexOf() mindig az első találat helyét írja ki
         */
         
         System.out.println(sb.indexOf("br")>-1);//true
         /*Itt nem a keresett szöveg helye érdekel, hanem az , hogy van-e.
         Ha a helye -1-től nagyobb, akkor benne van, de nem írja hogy pontosan hol.
         */
         
         System.out.println(sb.indexOf("Br"));//-1
         /*Egy nem létező indexet adott eredményül, vagyis a keresési részlet nem található meg a Stringben.
         */
         
         System.out.println(sb.substring(0,5));//abrak
         System.out.println(sb.substring(2,5));//rak
         System.out.println(sb.substring(5,8));//ada
         System.out.println(sb.substring(6));//dabra
         System.out.println(sb.substring(sb.length()));
         
         System.out.println(sb);
         sb.insert(0,"ABR");//beszúrás az elejére
         System.out.println(sb);
         sb.insert(1,"B");//beszúrás adott helyre
         System.out.println(sb);
         sb.insert(5,"ZABRA");
         System.out.println(sb);
         sb.insert(sb.length(),"A");//beszúrás a végére
         System.out.println(sb);
         
         StringBuilder sb2=new StringBuilder();
         sb2.append(1);
         sb2.append(true);
         sb2.append("Bela");
         
         String s=sb2.toString();//"1trueBela
         System.out.println(s);
    }
    
}
