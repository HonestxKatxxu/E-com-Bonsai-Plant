abstract class pop
{
abstract void zoll();
public void boll()
{
    System.out.println(" yo yoh concrete method");
}
}
class bob extends pop{
 void zoll(){
    System.out.println("this is zoll method");
 }
 public  static void mian(String[]args){
    bob coll = new bob();
    coll.zoll();
 }
}