import java.util.List;
import java.io.*;
public class Main{
    public static void  main(String[] args) {
        try{
            Scheduler scheduler=new Scheduler(); //Dosya Okuma
            List<MyProcess> processList= scheduler.readFile(args[0]);     
            Gorevlendirici gorevlendirici = new Gorevlendirici(); //Prosesleri çalıştırma
            //Runtime.getRuntime().exec("cls");
            gorevlendirici.KuyrugaGonder(processList);
            gorevlendirici.Calistir1();
         
          
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı. Doğru path giriniz.");
        } catch (IOException e) {
            System.out.println("Tekrar deneyin.");
        }
    
    }   
}