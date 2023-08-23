class EX{ 
public static void main(String[]arg){ 
try{
int data =100/0;
System.out.println("data");
}
catch(ArithmeticException e){ 
System.out.println("Somthing went wrong:"+e);
}
}
}
