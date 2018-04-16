public class RPG {
  public static void main(String[] args)
  {
    String[] qA = IO.readAllLines("questions.txt");
    if (qA == null)
    {
      System.out.println("Could not read RPG questions file, goodbye!");
      System.exit(0);
    }
     int levels = qA.length / 8 ;
     Question[] questions = new Question[levels*5];
     for (int index = 0; index < levels; index++){
       String q = qA[index*8+0];
       String a = qA[index*8+1];

       questions[index*3]= new Question[q,a];

       q = qA[index*8+2];
       a = qA[index*8+3];

       questions[index*3+1]=new Question[q,a];

       q= qA[index*8+4];
       a = qA[index*8+5];

       question[index*3+2]= new Question[q,a];


     }
     int hp = 0;


  }
}
