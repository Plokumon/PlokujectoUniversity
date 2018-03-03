
public interface Diagonal{
	
	default double diagonal() {
	return (2 * super.area) ^ 1/2;
	}

}
