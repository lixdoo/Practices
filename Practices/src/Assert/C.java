package Assert;

interface  A{
	  public static final int x = 0;
	}
	class B{
	   int x =1;
	}
	class C extends B implements A {
	   public void pX(){
	      System.out.println(super.x);
	   }
	   public static void main(String[] args) {
	      new C().pX();
	   }
	}
