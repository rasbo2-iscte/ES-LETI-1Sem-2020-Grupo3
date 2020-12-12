import java.io.File;
import java.io.IOException;

public class LongMethod {
	
	private readFile r;
	private boolean b;
	
	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public LongMethod(int loc, int cyclo, int row) throws IOException {
		File file = new File("Defeitos.xlsx");
		r = new readFile(file);
		
//		System.out.println(r.getCell(row, 4));
//		
//		int b = (int)(Integer.valueOf(r.getCellInt(row, 4)));
//		
//		System.out.println(b);
		if(r.getCellInt(row, 4) > loc && r.getCellInt(row, 5) > cyclo) {
			b = true;
		}
	}
	
	public static void main(String[] args) throws IOException {
//		LongMethod l = new LongMethod(1, , 1);
//		System.out.println(l.isB());
	}
}
