import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import java.util.List;
/*
*Aptech Java
*Reflection Sample */
public class SampleRefl {
 public static void main(String[] args) 
            throws NoSuchMethodException, SecurityException {
Method sampMeth = SampleRefl.class.getMethod("sampMeth",
List.class);//here Method defined as sampMeth
      
 ParameterizedType sampleLiTy = (ParameterizedType)sampMeth.getGenericParameterTypes()[0];//here List //Type defined as SampleLiTy
      
 ParameterizedType sampleClTy = (ParameterizedType)sampleLiTy.getActualTypeArguments()[0];//here Class //Type defined as SampleClTy
      
  WildcardType sampleGenTy = (WildcardType)sampleClTy.getActualTypeArguments()[0];//here generic //Type defined as SampleGenTy
      
 Class<?> SampleGenCl = (Class<?>)sampleGenTy.getUpperBounds()[0];//here generic Class defined //as sampleGenCl

  boolean isException = Exception.class.isAssignableFrom(SampleGenCl);
  //to display whether the statement is true or false 
  System.out.println("This Class extends RuntimeException: " + isException);

  boolean isRuntimeException = RuntimeException.class.isAssignableFrom(SampleGenCl);
  // to display whether the statement is true or false"
 System.out.println("This Class extends RuntimeException: " + isRuntimeException);
  }
  public void sampMeth(List<Class<? extends Exception>> exceptionClasses) {
    
  }
}
