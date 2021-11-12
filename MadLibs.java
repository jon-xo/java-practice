/**
 * MadLibs
 */

public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Jon
    Date: 11/10/2021
    */
        public static void main(String[] args){
        
        String name1 = "Zack";
        String adjective1 = "fantastic";
        String adjective2 = "beautiful";
        String adjective3 = "glorious";
        String verb1 = "sprint";
        String noun1 = "elephant";
        String noun2 = "table";
        String noun3 = "Cincinnati";
        String noun4 = "pool";
        String noun5 = "airplane";
        String noun6 = "bridge";
  
        String name2 = "Matt";
        int number = 77;
        String place1 = "Saturn";      
        
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
      }
  
      
  }