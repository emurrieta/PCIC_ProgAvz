package hawc;

public class CSV implements InterfaceCSV<CSV> {
	@Override
	public boolean inputFile(String inputPath) {
		return (true);
	}

	public boolean outputFile(String outputPath) {
		return (true);
	}

	public CSV[] split(int segments)  {
		CSV[] csvs = new CSV[10];  
		return(csvs);
	}

	public CSV join(CSV[] segments, String outputPath) {
		CSV outputCSV;
		outputCSV = new CSV();
		outputCSV.outputFile (outputPath);

		return (outputCSV);
	}

	public String getRecord() { 
		return ("");

	}

	public void putRecord(String record){

	}
}
// HOLA 

