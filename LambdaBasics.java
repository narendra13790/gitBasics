package lambdaExpression;

public class LambdaBasics {
	
	
	public int addNum(int a , int b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		LambdaBasics obj=new LambdaBasics();
		
		System.out.println(obj.addNum(10, 20));
		
		/// same addNum method with lambda
		
		//syntax 
		//  InterfcaneName  any VaribaleName = (parameters) -> 
		//{
			
		//}
		
		AddNum addNum=(a,b) ->{ System.out.println("Addition : "+ (a+b)) ;return (a+b);};
		
		
		
		addNum.operation(9, 6);
		//System.out.println(addNum.operation(9, 6));
			
		
		
	}
	@FunctionalInterface
	interface AddNum
	{
		int operation(int rr, int nn);
	}

}
