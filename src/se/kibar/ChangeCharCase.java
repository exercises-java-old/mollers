package se.kibar;

class ChangeCharCase{
//list of unicode characters in Java: https://unicode-table.com/en/#control-character

    public static void main(String[] args){


	//prints out a-z
        //prints out A-Z
        System.out.println( ChangeCharCase.toUpperCase("") );

    }
    
    //modify the method so that it returns the input string with only UPPERCASE letters
    public static String toUpperCase(String input){
        String output = "";
	
        //prints out all lowercase letters a-z
        for(int i=97; i<123; i++){
            System.out.print((char)i+" " );
        }
	
        System.out.println();

        //prints out all uppercase letters A-Z
        for(int i=65; i<91; i++){
            System.out.print( (char)i+" " );
        }
        
        return output;

    }//toUpperCase


    //complete the method so that it returns the input string with only lowercase letters
    public static String toLowerCase(String input){
        String output = "";
        return output;
    }//toLowerCase


}//ChangeCharCase
