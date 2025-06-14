
class Main {
  public static void main(String[] args) {
  System.out.println("happily: " + Review.sentimentVal("happily"));    // 2.32
        System.out.println("terrible: " + Review.sentimentVal("terrible"));  // -3.38
        System.out.println("cold: " + Review.sentimentVal("cold"));          // -0.04
        System.out.println("banana: " + Review.sentimentVal("banana"));      // 0.0 (likely not in the list)
        System.out.println("amazing: " + Review.sentimentVal("amazing"));    // (e.g., maybe 3.1)
        System.out.println("boring: " + Review.sentimentVal("boring"));      // (e.g., maybe -2.0) 
  }
}
