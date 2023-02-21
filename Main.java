/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		travelagencies ta[]=new travelagencies[2];
		for(int i=0;i<2;i++){
		    int a=sc.nextInt();
		    sc.nextLine();
		      String b=sc.nextLine();
		    String c=sc.nextLine();
		    int d=sc.nextInt();sc.nextLine();
		    boolean e=sc.nextBoolean();
		    ta[i]=new travelagencies(a,b,c,d,e);
		}
		int input1=sc.nextInt();sc.nextLine();
		String input2=sc.nextLine();
		
		int answer=AgencyWithHighestPakagePrice(ta);
		System.out.println(answer);
		
		travelagencies answer2=method2(ta,input1,input2);
		System.out.println(answer2.getagencyName());
		
		
	}
	
	public static int AgencyWithHighestPakagePrice(travelagencies ta[]){
	    int max=0;
	    for(int i=0;i<ta.length;i++){
	        if(ta[i].getprice()>max){
	            max=ta[i].getprice();
	        }
	    }
	    return max;
	}
	
	public static travelagencies method2(travelagencies[] ta,int input1,String input2){
	    for(int i=0;i<ta.length;i++){
	        if(ta[i].getflightFacility()==true){
	            if(ta[i].getregNo()==input1 && ta[i].getpakageType().equalsIgnoreCase(input2)){
	                return ta[i];
	            }
	        }
	    }
	    return null;
	}
	
	
	
	
	
	
}

class travelagencies{
    private int regNo;
    private String agencyName;
    private String pakageType;
    private int price;
    private boolean flightFacility;
    
      travelagencies(int regno,String agencyName,String pakageType,int price,boolean flightFacility){
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.pakageType=pakageType;
        this.price=price;
        this.flightFacility=flightFacility;
        
    }
    
    public int getregNo(){
        return regNo;
    }
    public String getagencyName(){
        return agencyName;
    }
    public String getpakageType(){
        return pakageType;
    }
    public int getprice(){
        return price;
    }
    public boolean getflightFacility(){
        return flightFacility;
    }
    
    
    
    
}





		
		
