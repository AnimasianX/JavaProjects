package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<T extends Aggregator> {
	
	T aggregator;
	String fileName;
	
	public AggregatorProcessor(T agg, String fileName) {
		super();
		this.aggregator = agg;
		this.fileName = fileName;
	}
	
	public double runAggregator(int column) throws IOException {
		StockFileReader fr = new StockFileReader(this.fileName);
		
		List<String> strList = fr.readFileData();
		column--;
		for(String lines : strList) {
			String [] numbers = lines.split(",");
			Number value = Double.parseDouble(numbers[column]);
			aggregator.add(value.doubleValue());
		}
		
		double number = aggregator.calculate();
		
		return number;
		
	}
	
}
