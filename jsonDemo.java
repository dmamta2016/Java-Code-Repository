public class jsonDemo {
	public static void main(String args[])
	{
	    String json = """
        {
         "name": "Dune", "year": 2021,
         "details": {"actors": 25, "budget (millions": 35,
        "units": 6}, "tags": ["films", "epic"],"rating": 9
        }              
      """;
		System.out.println(json);
		}
}
