package p1;

abstract class Converter
{
 abstract double convert(double atm);
}
class AtmtoTorrConverter extends Converter 
{
 @Override
 double convert(double atm) 
 {
     return atm * 760;
 }
}
public class Abstract
{
 public static void main(String[] args) 
 {
     AtmtoTorrConverter converter = new AtmtoTorrConverter();
     double atmValue = 1.5; 
     double torrValue = converter.convert(atmValue);
     System.out.println(atmValue + " atm = " + torrValue + " torr");
 }
}
