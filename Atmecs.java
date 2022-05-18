//import Dogsss.Movie;

public class Atmecs {
String Moviename;
String Actorname;
String Actressname;
String Directorname;
int viewersRating;
Atmecs(){
	Moviename=null;
	Actorname=null;
	Actressname=null;
	Directorname=null;
	viewersRating=0;
}
Atmecs(String Moviename,String Actorname,String Actressname,String Directorname,int viewersRating){
	this.Moviename =Moviename;
	this.Actorname =Actorname;
	this.Actressname =Actressname;
	this.Directorname =Directorname;
	this.viewersRating =viewersRating;
	}
void displaymoviedetails() {
	System.out.println("Movie Details:");
	System.out.println("Movie Name:"+Moviename);
	System.out.println("Actor Name:"+Actorname);
	System.out.println("Actress Name:"+Actressname);
	System.out.println("Director Name:"+Directorname);
	System.out.println("viewersRating:"+viewersRating);	
}
public static void main(String[] args) {
	Atmecs Atmecs1 = new Atmecs("ET", "Surya", "Priyanka", "praj", 8);
	Atmecs1.displaymoviedetails();
	Atmecs movie2 =new Atmecs("mankatha","Ajith","Trisha","VP",9);
	movie2.displaymoviedetails();
}
}

	