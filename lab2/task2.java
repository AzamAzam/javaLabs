public  class  task2{
 public static class  Box {
	private int   height, width, depth; 
	public   Box (){
		height=width=depth=0;
	 }
	public   Box (Box  obj ){
		this.height=obj.height;
		this.width=obj.width;
		this.depth=obj.depth;
	}
	public   Box  (int  h ,int  w, int  d){
		height=h;
		depth=d;
		width=w;
	}
	public  Box (int  x){
		height=width=depth=x;
	}  
	public int  getvolume(){
		return  height*width*depth;
	} 
 }
	public  static  void  main  (String args[]){
		Box obj1=new Box(3,5,6);
		Box obj2=new Box(4);
		Box obj3=new Box ();
		Box obj4=new Box (obj1);
		System.out.println("Volume of  3d   is  "+obj1.getvolume());		
		System.out.println("Volume of  cube   is  "+obj2.getvolume());		
		System.out.println("Volume of  default  is  "+obj3.getvolume());		
		System.out.println("Volume of  cloned   is  "+obj4.getvolume());		
	}
}