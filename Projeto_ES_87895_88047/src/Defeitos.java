import java.io.File;
import java.io.IOException;

public class Defeitos {
	
	private readFile r;
	private int dci;
	private int dii;
	private int adci;
	private int adii;
	
	
	public Defeitos(int loc, int cyclo) throws IOException {
		File file = new File("Defeitos.xlsx");
		r = new readFile(file);
		
		
		for(int i = 1; i <= 420; i++) {
			LongMethod lm = new LongMethod(loc, cyclo, i);
			
			if(r.getCell(i, 9).equals("FALSE") && r.getCell(i, 10).equals("FALSE")) {
				if(!lm.isB()) {
					adci++;
				}
				else {
					adii++;
				}
			}
			else {
				if(r.getCell(i, 9).equals("FALSE") && r.getCell(i, 10).equals("TRUE")) {
					if(!lm.isB()) {
						adci++;
						dii++;
					}
					else {
						adii++;
						dci++;
					}
				}
				else {
					if(r.getCell(i, 9).equals("TRUE") && r.getCell(i, 10).equals("FALSE")) {
						if(!lm.isB()) {
							adci++;
							dii++;
						}
						else {
							adii++;
							dci++;
						}
					}
					else {
						if(r.getCell(i, 9).equals("TRUE") && r.getCell(i, 10).equals("TRUE")) {
							if(!lm.isB()) {
								dii++;
							}
							else {
								dci++;
							}
						}	
					}
				}	
			}
		}
		
		System.out.println("DCI:" + dci);
		System.out.println("DII:" + dii);
		System.out.println("ADCI:" + adci);
		System.out.println("ADII:" + adii);
	}
	
	
	public static void main(String[] args) throws IOException {
		Defeitos j = new Defeitos(50, 10);
	}
}
