import java.util.Optional;
		public class StringResolveConstantDesc {
		public static void main(String[] args) {
	

	Integer i = 10;
        Optional<Integer> o = i.describeConstable();
       
        System.out.println(o); //Optional[10]
	
	}
	}
