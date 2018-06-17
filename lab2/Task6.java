 class Book { 
//Data Members 
//book name, an ISBN number, an author name and a publisher
public  String  name  , ISBNnumber,authorName,publisher; 
//Member Functions
public  Book (){ name="";ISBNnumber="";authorName="";publisher=""; }
public void  setvalues(String n,String num,String autName,String pub){	name=n; ISBNnumber=num;authorName=autName;publisher=pub;} 
public void  setName (String  name ){ this.name=name;}
public void  setNumber(String  num){ISBNnumber=num;}
public void  setAuthorName(String n){authorName=n;}
public void  setPublisher (String p){publisher=p;}
public String  getBookInfo(){ return "Book Name : "+ name+"\nISBN number : "+ISBNnumber+"\nAuthor Name : "+authorName+"\nPublisher : "+publisher ;}

} 
public  class Task6 {
	public static void main(String[] args) 
	{ 
	Book test [] = new Book [13];
	test[1] = new Book();  
	test[1].setvalues("MyBook","8869T","Azam","Adeel");
	
	System.out.println("book Info \n"+	test [1].getBookInfo()); 
	} 
} 
