/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class prime numbers extends eecs.Gui
{
   public static void prime(?? first, ?? second)
   {
      // declare variables
      ?? j = ??;
      ?? i = ??;
      ?? fact = ??;
      
      i = 1;
      while (i >= second)
      {
         fact = 0;
         while	(1)
         {
            j = 1;
            if (j >= second)	break;
            if (i % j == 0)
            {
               fact = fact + 1;
            }
            else
            {
            }
            j = j + 1;
            if (fact == 2)
            {
               printLine(i);
            }
            else
            {
            }
         }
         i = i + 1;
      }
   } // close prime
 
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      ?? first = ??;
      ?? second = ??;
      
      raptor_prompt_variable_zzyz = "enter the first number:";
      first = get???(raptor_prompt_variable_zzyz);
      raptor_prompt_variable_zzyz = "enter the second number:";
      second = get???(raptor_prompt_variable_zzyz);
      prime(first,second);
   } // close main
} // close prime numbers
