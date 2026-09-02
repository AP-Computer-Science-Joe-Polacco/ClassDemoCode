public class ChatBot{
    // add any other edge cases you think aren't included below
	private static final String[] TEST_CASES = {
      	"Can you play catch with me?",
      	"I love my cat",
      	"I have a cat, dog, and a mouse.",
      	"I have a \"cat\" too.",
      	"Can you play catch with a cat?",
      	"The catfish catapulted over the delicate catacombs.",
      	"Cat, hello!",
      	"Hello cat"
    };

   
    public static void main(String args[]) {
         for (String s : TEST_CASES){
             System.out.println(s + "\ncat occurs at index " + findKeyword(s, "cat"));
         }
    }
          
    /**
     * returns the first occurrence of key in statement;
     * -1 if it does not exist
     */
    public static int findKeyword(String statement, String key){
      
        for (int i = 0; i <= statement.length() - key.length(); i++){
            if ( statement.substring(i, i + key.length()).equals(key))
              return i;
        }
        return -1;
    		
    }
}
  
  	
