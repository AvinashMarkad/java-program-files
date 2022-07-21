class Lang {

  String languages;

  // constructor accepting single value
  Lang(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
   Lang obj1 = new Lang("Java");
    Lang obj2 = new Lang("Python");
   Lang obj3 = new Lang("C");
  }
}