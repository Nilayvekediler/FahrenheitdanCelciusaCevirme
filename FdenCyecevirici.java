/* Fahrenheit derecesinin santigrat derecesine cevirisini yapan bir program yazilacaktir. Kullanicidan double
veri tipinde fahrenheit derecesi mesaj kutusu ile istenecek, program tarafindan bunun santigrat karsiligi 
hesaplanacak ve sonuc mesaj kutusuyla ekrana yansitilacaktir. */

// °C = (°F - 32) x (5/9)
import javax.swing.JOptionPane; //Program diyalog kutusu icin JOptionPane'i kullanacak

public class FdenCyecevirici 
{
   public static void main(String[] args)
   {
       
       JOptionPane.showMessageDialog(null, "Fahrenheit'dan Celcius'a dönüştürme uygulamamıza hoş geldiniz!");

       String girdiFahrenheit;
       double girdiF;
       double celcius;

       girdiFahrenheit = JOptionPane.showInputDialog("Lütfen çevirmek istediğiniz Fahrenheit derecesini giriniz:");

       girdiF = Double.parseDouble(girdiFahrenheit);

       
       celcius = (girdiF - 32) * (5.0/9); /* (5/9) degerini sistem int/int oldugu icin int sonuc olarak alir ve
       0.5555 degeri yerine 0 olarak algilar. Bu problemin cozumunun soyle yollari vardir: 1-(5.0/9) yapmak
       double/int den deger double olarak algilanir. 2- 1. ile ayni mantikla (5/9.0) yapmak. 3-(5.0/9.0) yapmak
       double/double da bir double sonuc verir tabiki. 4- double yapmak icin (5d/9) yazmak. 5- 4. ile ayni mantikta
       (5/9d) yapmak. 6- (5d/9d) yapmak 7- Hic parantez acmayip islemi "celcius = (girdiF - 32) * 5/9;" seklinde 
       birakmak. Cunku boylece (girdiF - 32) sonucu cikan sayiyi once 5 ile carpar sonra 9 ile boler 5/9'u bir butun
       sabit olarak algilamayacagi icin sorun olmaz sonuc dogru cikar. 8- (5/9) u x diye double bir degiskene ustte
       esitleyebilir denklemde de "celcius = (girdiF - 32) * x;" olarak kullanirdik. */

       JOptionPane.showMessageDialog(null, "Girdiğiniz Fahrenheit derecesinin Celcius olarak karşılığı: " + celcius +"°C", "Celcius", JOptionPane.PLAIN_MESSAGE);
      
   }

}













